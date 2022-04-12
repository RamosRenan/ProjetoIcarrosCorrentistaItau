/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.utfpr.playsum.general;

/**
 *
 * @author renan
 */
public enum Timer {
    TIMER(10);

    public int cod;

    Timer(int timer) {
        this.cod = timer;
    }

    public int spenTime() {
        return TIMER.ordinal();
    }
}
