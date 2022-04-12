/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.utfpr.playsum.cdi;

import com.utfpr.playsum.ejb.EjbCreatePlayer;
import com.utfpr.playsum.general.TimeOut;
import com.utfpr.playsum.model.PlayerModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author renan
 */
@Named(value = "cDIGame")
@SessionScoped
public class CDIGame implements Serializable{

    // private int timer = 12;
    // private TimeOut timeout;
    private Random numberRandom;
    private int numberRandom1;
    private int numberRandom2;
    private int resp1;
    private int resultado;
    private boolean right = false;
    private String namePlayer = "Renan";

    /**
     * Creates a new instance of CDIGame
     */
    public CDIGame() {
        // timeout = new TimeOut();
        numberRandom = new Random();
        numberRandom1 = numberRandom.nextInt(50);
        numberRandom2 = numberRandom.nextInt(50);
    }

     @EJB
    private EjbCreatePlayer ejbCreatePlayer;


    @Inject
    private HttpSession httpSession;

    public int getResp1() {
        return resp1;
    }

    public void setResp1(int resp1) {
        this.resp1 = resp1;
    }

    public String resultado() {
        resultado = numberRandom1 + numberRandom2;

        if (resultado == resp1) {
            Iterator<PlayerModel> it = ejbCreatePlayer.getPlayers().iterator();
if(ejbCreatePlayer != null){
System.out.println(" --> name in session attr: "+httpSession.getAttribute("name"));
List<PlayerModel> pm = ejbCreatePlayer.getPlayers();
for(PlayerModel p : pm)
{
System.out.println("--> for / name :"+p.getName());
}
}
            while (it.hasNext()) {
                PlayerModel playerModel = it.next();
                System.out.println(" --> Name: "+playerModel.getName());
            }
            //PlayerModel pm = ejbCreatePlayer.getPlayers().stream().filter(n -> n.getName().equals(this.namePlayer)).findFirst().get();
//            System.out.println("--> User: "+pm.getName());
//            int pointsumation = ejbCreatePlayer.getPlayers().stream().filter(n -> n.getName().equals(this.getNamePlayer())).findFirst().get().getPointSummation();
//            ejbCreatePlayer.getPlayers().stream().filter(n -> n.getName().equals(this.getNamePlayer())).findFirst().get().setPointSummation(pointsumation+1);;
            //.stream().anyMatch(n -> n.getName().equals(playerModel.getName()));
            right = true;
        }

        Client client = ClientBuilder.newClient();
        WebTarget wt = client.target("http://localhost:8085/playsum/faces/pages/game.xhtml");
        return "/pages/Resultadosoma";
    }

    public int getResultado() {
        return resultado;
    }

    public int getNumberRandom1() {
        return numberRandom1;
    }

    public int getNumberRandom2() {
        return numberRandom2;
    }

    public boolean isRight() {
        return right;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

//    public int initTimeOut() {
//        return this.timeout.getTimer();
//    }
//
//    public int getTimer() {
//        return this.timer;
//    }
//
//    public void setTimer(int timer) {
//        this.timer = timer;
//    }
    public void setNumberRandom1(int numberRandom1) {
        this.numberRandom1 = numberRandom1;
    }

    public void setNumberRandom2(int numberRandom2) {
        this.numberRandom2 = numberRandom2;
    }
}
