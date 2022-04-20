/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsumm.messagedrivenbeans;

import com.utfpr.playsumm.model.PlayerModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 * Logical JNDI Name: java:comp/DefaultJMSConnectionFactory
 *
 * @author renan
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java/Fila"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),})
public class MessageDB implements MessageListener {

    @Resource
    MessageDrivenContext context;

    public MessageDB() {
    }

    @Override
    public void onMessage(Message msg) 
    {
        ObjectMessage message = (ObjectMessage) msg;
        
        PlayerModel playerModel;
        try {
            playerModel = (PlayerModel) message.getObject();
            System.out.println("--> Name: "+playerModel.getName());
            System.out.println("--> Score: "+playerModel.getAccruedPoint());
            System.out.println("---------------------------------------");
        } catch (JMSException ex) {
            Logger.getLogger(MessageDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
