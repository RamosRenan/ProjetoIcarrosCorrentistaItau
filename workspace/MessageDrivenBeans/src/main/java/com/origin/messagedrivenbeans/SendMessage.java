/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.origin.messagedrivenbeans;

import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
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
    
    public void send()
    {
        try(JMSContext context = connectionFactory.createContext()) {
            String message  = "Sending message to teste";
            context.createProducer().send(destination, message);
            context.createProducer().send(destination, context.createMessage());
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
