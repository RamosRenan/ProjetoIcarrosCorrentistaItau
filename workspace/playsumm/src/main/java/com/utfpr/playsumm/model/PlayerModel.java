/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsumm.model;

import com.utfpr.playsumm.interfaces.Player;

/**
 *
 * @author renan
 */
public class PlayerModel implements Player {

    private String name;
    private int accruedPoint;
    private String sessionId;

    public PlayerModel() {
    }

    public PlayerModel(String name) {
        this.name = name;
    }

    public void storePoints() {
        this.accruedPoint++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccruedPoint() {
        return accruedPoint;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }



}
