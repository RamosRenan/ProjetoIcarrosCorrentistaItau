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
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBObject;
import javax.ejb.SessionContext;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author renan
 */
@Named(value = "cDIGames")
@SessionScoped
public class CDIGames implements Serializable {

    /**
     * Creates a new instance of CDIGames
     */
    public CDIGames() {
    }

     @EJB
    private EjbCreatePlayer ejbCreatePlayer;

@PostConstruct
    public void constr()  {


    }

    public void resultado() throws NamingException {
 
        if (ejbCreatePlayer != null) {
            List<PlayerModel> pm = ejbCreatePlayer.getPlayers();
            for (PlayerModel p : pm) {
                System.out.println("--> CDIGames for / name :" + p.getName());
            }

        }
                System.out.println("--> CDIGames for / name :");
             
    }

    public EjbCreatePlayer getEjbCreatePlayer() {
        return ejbCreatePlayer;
    }

    public void setEjbCreatePlayer(EjbCreatePlayer ejbCreatePlayer) {
        this.ejbCreatePlayer = ejbCreatePlayer;
    }
}
