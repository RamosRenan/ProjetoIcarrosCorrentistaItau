/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.utfpr.playsumm.messagedrivenbeans;

import com.utfpr.playsumm.model.PlayerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

/**
 *
 * @author renan
 */
@Stateful
public class SendMessage {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private  ConnectionFactory connectionFactory;
    
    @Resource(lookup = "java/Fila")
    private  Queue queue;
    
    Destination destination = (Destination) queue;
    
    public void send(PlayerModel o)
    {
        try(JMSContext context = connectionFactory.createContext()) {
            ObjectMessage message1 = context.createObjectMessage(o);
            context.createProducer().send(queue, message1);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
