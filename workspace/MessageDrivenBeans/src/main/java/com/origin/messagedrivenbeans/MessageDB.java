/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.origin.messagedrivenbeans;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Logical JNDI Name:  java:comp/DefaultJMSConnectionFactory
 * @author renan
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java/Fila"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
 })
public class MessageDB implements MessageListener{

    @Resource
    MessageDrivenContext context;

    public MessageDB(){}

    @Override
    public void onMessage(Message msg) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            if(msg instanceof TextMessage){
                System.out.println("Menssagem recebida: "+((TextMessage) msg).getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
