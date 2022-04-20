/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.utfpr.playsumm.cdi;

import com.utfpr.playsumm.ejb.EJBShowPlayers;
import com.utfpr.playsumm.model.PlayerModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author renan
 */
@Named(value = "cDIShowPlayers")
@SessionScoped
public class CDIShowPlayers implements Serializable {

    /**
     * Creates a new instance of CDIShowPlayers
     */
    public CDIShowPlayers() {
    }

    @EJB
    private EJBShowPlayers eJBShowPlayers;

    public List<PlayerModel> showPlayers() {
        return eJBShowPlayers.showPlayers();
    }

    public String showPlayerss() {
        return "/showplayers";
    }

}
