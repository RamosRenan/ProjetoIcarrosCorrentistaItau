/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.utfpr.playsum.cdi;

import com.utfpr.playsum.ejb.EjbCreatePlayer;
import com.utfpr.playsum.model.PlayerModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 *
 * @author renan
 */
@Named(value = "cDICreatePlayer")
@SessionScoped
public class CDICreatePlayer implements Serializable {

    /*
    *    @author renan
    *    Not in use
     */
    @Deprecated
    private int timer;

    private String name;

    @Inject
    private HttpSession httpSession;

    /**
     * Creates a new instance of CDICreatePlayer
     */
    public CDICreatePlayer() {
    }

    @PostConstruct
    public void constr() {
        httpSession.setAttribute("timer", 10);
    }

    @EJB
    private EjbCreatePlayer ejbCreatePlayer;

    public List<PlayerModel> getPlayers() {
        return ejbCreatePlayer.getPlayers();
    }

    public String addPlayer() {
        PlayerModel playerModel = new PlayerModel();
        playerModel.setName(name);
        ejbCreatePlayer.addPlayer(playerModel);
        httpSession.setAttribute("name", this.name);

        return "/game";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    *    @author renan
    *    Not in use
     */
    @Deprecated
    private void doSess() {
        httpSession.setAttribute("timer", 10);
        httpSession.setAttribute("name", "renan");
    }

    /*
    *    @author renan
    *    Not in use
     */
    @Deprecated
    public int getTimer() {
        return timer;
    }

    /*
    *    @author renan
    *    Not in use
     */
    @Deprecated
    public void setTimer(int timer) {
        this.timer = timer;
    }
}
