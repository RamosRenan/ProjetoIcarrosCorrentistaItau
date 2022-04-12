/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsum.model;

import com.utfpr.playsum.interfaces.Player;
import javax.ejb.Stateful;

/**
 *
 * @author renan
 */
public class PlayerModel implements Player {

    private String name;

    private int pointAdding;

    private int pointSummation;

    public void storePoints(int summation) {
        this.pointSummation = summation;
    }

    public int getPoints() {
        return this.pointSummation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointAdding() {
        return pointAdding;
    }

    public void setPointAdding(int pointAdding) {
        this.pointAdding = pointAdding;
    }

    public int getPointSummation() {
        return pointSummation;
    }

    public void setPointSummation(int pointSummation) {
        this.pointSummation = pointSummation;
    }

     

}
