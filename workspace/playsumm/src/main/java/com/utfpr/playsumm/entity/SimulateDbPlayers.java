/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package com.utfpr.playsumm.entity;

import com.utfpr.playsumm.model.PlayerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author renan
 */
@Singleton
public class SimulateDbPlayers implements Serializable{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private List<PlayerModel> playerModel;

    @PostConstruct
    private void instaceDb() {
        playerModel = new ArrayList<>();
    }

    public List<PlayerModel> getPlayerModel() {
        return playerModel;
    }
}
