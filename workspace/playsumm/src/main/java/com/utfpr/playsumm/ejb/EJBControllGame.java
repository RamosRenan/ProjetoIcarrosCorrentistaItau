/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.utfpr.playsumm.ejb;

import com.sun.net.httpserver.HttpServer;
import com.utfpr.playsumm.model.PlayerModel;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.inject.Inject;
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
    private int score;

    public EJBControllGame() {
        randomNumber = new Random();
    }

    @PostConstruct
    private void wichUser() {
        user = (String) httpSessionEJBControllGame.getAttribute("name");
        System.out.println("--> Wich user is now: " + user);
    }

    @Inject
    private HttpSession httpSessionEJBControllGame;

    @EJB
    private EJBShowPlayers eJBShowPlayers;

    public int getRandomNumber1() {
        num1 = randomNumber.nextInt(99);
        return num1;
    }

    public int getRandomNumber2() {
        num2 = randomNumber.nextInt(99);
        return num2;
    }

    public String answer() {
        if (isRight()) {
            System.out.println("--> Resposta correta \n");
            System.out.print("\n--------------------------------------------------------\n");
            System.out.print("\n Mostrando lista de players");

            List<PlayerModel> playerModels = eJBShowPlayers.showPlayers();

            for (PlayerModel p : playerModels) {
                System.out.println("--> USer: " + p.getName());
            }

            eJBShowPlayers.showPlayers().stream().filter((n) -> n.getName().equals(this.user)).findAny().get().storePoints();

            score = eJBShowPlayers.showPlayers().stream().filter((n) -> n.getName().equals(this.user)).findAny().get().getAccruedPoint();

            System.out.print("\n--------------------------------------------------------\n");
            System.out.print("\n Mostrando lista de players com SCORE");
            for (PlayerModel p : playerModels) {
                System.out.println("--> User: " + p.getName() + " / " + "Score: " + p.getAccruedPoint());
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
