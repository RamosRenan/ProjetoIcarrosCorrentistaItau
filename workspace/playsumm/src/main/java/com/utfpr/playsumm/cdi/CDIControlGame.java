/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.utfpr.playsumm.cdi;

import com.utfpr.playsumm.ejb.EJBControllGame;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author renan
 */
@Named(value = "cDIControlGame")
@SessionScoped
public class CDIControlGame implements Serializable {

    private int num1;
    private int num2;
    private int reposta;
    private int score;

    /**
     * Creates a new instance of CDIControlGame
     */
    public CDIControlGame() {
    }

    @EJB
    private EJBControllGame controllGame;

    public String responder() {
        controllGame.setResposta(this.reposta);
        return controllGame.answer();
    }

    public int getNum1() {
        return num1 = controllGame.getRandomNumber1();
    }

    public int getNum2() {
        return num2 = controllGame.getRandomNumber2();
    }

    public int getReposta() {
        return reposta;
    }

    public void setReposta(int reposta) {
        this.reposta = reposta;
    }

    public int getScore() {
        return score = controllGame.getScore();
    }

//    public EJBControllGame getControllGame() {
//        return controllGame;
//    }
//
//    public void setControllGame(EJBControllGame controllGame) {
//        this.controllGame = controllGame;
//    }
}
