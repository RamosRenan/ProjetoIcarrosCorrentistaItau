/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.origin.messagedb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author renan
 */
@Stateless
public class SendMessage {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private  ConnectionFactory connectionFactory;
    
    @Resource(lookup = "java/Fila")
    private  Queue queue;
    
    public void send()
    {
        try(JMSContext context = connectionFactory.createContext()) {
            String message  = "Sending message to teste";
            context.createProducer().send(queue, message);
            context.createProducer().send(queue, context.createMessage());
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
