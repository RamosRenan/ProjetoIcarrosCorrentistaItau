/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.utfpr.playsumm.ejb;

import com.utfpr.playsumm.entity.SimulateDbPlayers;
import com.utfpr.playsumm.model.PlayerModel;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author renan
 */
@Stateful
public class EJBCreatePlayer {

    private final PlayerModel PLAYER_FAKE;
    private PlayerModel player;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public EJBCreatePlayer() {
        PLAYER_FAKE = new PlayerModel("name fake");
        System.out.println("--> Criando player fake");
    }

    // simulate db players
    @EJB
    private SimulateDbPlayers dbPlayers;

    // cria player
    public void addPlayer(String name, String sessionId) {
        this.player = new PlayerModel(name);
        this.player.setSessionId(sessionId);
        dbPlayers.getPlayerModel().add(this.player);
        System.out.println("--> Criando usuario: " + name);
    }

    public String getPLAYER_FAKE() {
        return PLAYER_FAKE.getName();
    }
}
