/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsum.general;

/**
 *
 * @author renan
 */
public class TimeOut implements Runnable {

    private int timer;

    public TimeOut() {
        //new Thread(this).start();
    }

    public void run() {
        for (Timer t : Timer.values()) {
            System.out.println("--> t values timer:: " + t);
        }

        for (int i = Timer.TIMER.cod; i > 0; i--) {
            this.timer = i;
            System.out.println("--> timer:: " + timer);
            System.out.println("\n");

            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("--> timer:: " + Timer.TIMER);
        System.out.println("--> name timer:: " + Timer.TIMER.name());
        System.out.println("--> spenTime timer:: " + Timer.TIMER.spenTime());
        System.out.println("--> spenTime timer:: " + Timer.TIMER.spenTime());
        System.out.println("--> valueOf timer:: " + Timer.valueOf("TIMER"));
        System.out.println("--> cod timer:: " + Timer.TIMER.cod);
    }

    public int getTimer() {
        return this.timer;
    }
}
