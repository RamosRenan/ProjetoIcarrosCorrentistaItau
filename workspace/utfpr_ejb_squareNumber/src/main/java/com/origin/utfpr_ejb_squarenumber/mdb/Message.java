/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.origin.utfpr_ejb_squarenumber.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.MessageListener;
import javax.resource.spi.ConfigProperty;

/**
 *
 * @author renan
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java/FilaSquare"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class Message implements MessageListener{
   
    @Override
    public void onMessage(javax.jms.Message msg) {
        try {
            int numString =  msg.getBody(Integer.class);
            
            //int num = Integer.parseInt(numString);
            
            System.out.println("Quadrado do número é: "+(numString));
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    
}
