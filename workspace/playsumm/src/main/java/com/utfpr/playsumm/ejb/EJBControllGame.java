/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.utfpr.playsumm.ejb;

import com.sun.net.httpserver.HttpServer;
import com.utfpr.playsumm.messagedrivenbeans.SendMessage;
import com.utfpr.playsumm.model.PlayerModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.jms.ObjectMessage;
import javax.servlet.http.HttpSession;

/**
 *
 * @author renan
 */
@Stateful
public class EJBControllGame {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private Random randomNumber;
    private int resposta;
    private int num1;
    private int num2;
    private boolean right = false;
    private String user;
    private static int score;

    public EJBControllGame() {
        randomNumber = new Random();
    }

    @PostConstruct
    private void wichUser() {
        this.user = (String) httpSessionEJBControllGame.getAttribute("name");
        System.out.println("--> Wich user is now: " + httpSessionEJBControllGame.getAttribute("name"));
    }

    @Inject
    private HttpSession httpSessionEJBControllGame;

    @EJB
    private EJBShowPlayers eJBShowPlayers;

    @EJB
    SendMessage message;

    public int getRandomNumber1() {
        num1 = randomNumber.nextInt(999);
        return num1;
    }

    public int getRandomNumber2() {
        num2 = randomNumber.nextInt(999);
        return num2;
    }

    public String answer() {
        this.user = (String) httpSessionEJBControllGame.getAttribute("name");
        System.out.println("--> method answer() wich user is now: " + httpSessionEJBControllGame.getAttribute("name"));

//        if(!httpSessionEJBControllGame.getAttribute("name").equals("renan")){
//            FacesMessage facesMessage = new FacesMessage("Só eu ganho");
//            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
//            return "";
//        }
        if (isRight()) {
            System.out.println("--> Resposta correta \n");
            System.out.print("\n--------------------------------------------------------\n");
            System.out.print("\n Mostrando lista de players");

            List<PlayerModel> playerModels = eJBShowPlayers.showPlayers();

            for (PlayerModel p : playerModels) {
                System.out.println("--> USer: " + p.getName());
            }

            playerModels.stream().filter((n) -> n.getName().equals(this.user)).findAny().get().storePoints();

            score = playerModels.stream().filter((n) -> n.getName().equals(this.user)).findAny().get().getAccruedPoint();

            PlayerModel model = playerModels.stream().filter((n) -> n.getName().equals(this.user)).findAny().get();

            if (score >= 5) {
                for (PlayerModel p : playerModels) {
                    message.send(p);
                }
            }
        }

        return "";
    }

    private boolean isRight() {
        return this.num1 + this.num2 == this.resposta ? true : false;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public int getScore() {
        return score;
    }
}
