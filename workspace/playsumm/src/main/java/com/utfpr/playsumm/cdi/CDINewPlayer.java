/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.utfpr.playsumm.cdi;

import com.utfpr.playsumm.ejb.EJBCreatePlayer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 *
 * @author renan
 */
@Named(value = "cDINewPlayer")
@SessionScoped
public class CDINewPlayer implements Serializable {

    private String name;

    /**
     * Creates a new instance of CDINewPlayer
     */
    public CDINewPlayer() {
    }

    @EJB
    private EJBCreatePlayer bCreatePlayer;

    @Inject
    private HttpSession httpSessionCDINewPlayer;

    // add player joined with session
    public void addPlayer() {
        if (this.name != null) {

            System.out.println("Session name: " + httpSessionCDINewPlayer.getAttribute("name"));

            bCreatePlayer.addPlayer(this.name, httpSessionCDINewPlayer.getId());
            httpSessionCDINewPlayer.setAttribute("name", this.name);

            System.out.println("Session name: " + httpSessionCDINewPlayer.getAttribute("name"));

        } else {
            return;
        }
    }

    public String play() {
        if (!httpSessionCDINewPlayer.getAttribute("name").toString().isEmpty() && httpSessionCDINewPlayer.getAttribute("name").toString() != null) {
            return "/game";
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
