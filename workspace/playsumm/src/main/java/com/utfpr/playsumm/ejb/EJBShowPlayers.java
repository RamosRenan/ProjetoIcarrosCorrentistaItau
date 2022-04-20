/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.utfpr.playsumm.ejb;

import com.utfpr.playsumm.entity.SimulateDbPlayers;
import com.utfpr.playsumm.model.PlayerModel;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author renan
 */
@Stateful
public class EJBShowPlayers implements Serializable{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    // simulate db players
    @EJB
    private SimulateDbPlayers dbPlayers;

    public List<PlayerModel> showPlayers() {
        return dbPlayers.getPlayerModel();
    }
}
