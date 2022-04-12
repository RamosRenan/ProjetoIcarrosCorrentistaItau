/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.utfpr.playsum.ejb;

import com.utfpr.playsum.model.PlayerModel;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author renan
 */
@Stateful
public class EjbCreatePlayer {
    private final List<PlayerModel> playerModel;

    public EjbCreatePlayer() {
        this.playerModel = new ArrayList<>();
    }

    public void addPlayer(PlayerModel playerModel) {
        if (existPlayerModel(playerModel)) {
            return;
        }
        this.playerModel.add(playerModel);
        System.out.println("--> succss");
    }

    public boolean existPlayerModel(PlayerModel playerModel) {
        return this.playerModel.stream().anyMatch(n -> n.getName().equals(playerModel.getName()));
    }

    public List<PlayerModel> getPlayers() {
        return playerModel;
    }

}
