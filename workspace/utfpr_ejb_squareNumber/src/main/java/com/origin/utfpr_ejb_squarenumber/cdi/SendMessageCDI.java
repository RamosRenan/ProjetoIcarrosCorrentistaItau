/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.origin.utfpr_ejb_squarenumber.cdi;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author renan
 */
@Named(value = "sendMessageCDI")
@RequestScoped
public class SendMessageCDI {

    private int num;
    
    /**
     * Creates a new instance of SendMessageCDI
     */
    public SendMessageCDI() {
    }
    
    @Resource(lookup = "java/FilaSquare")
    Queue queue;
    
    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    ConnectionFactory cf;
    
    public void send()
    {
        System.out.println("--> Enviando mensagem ... ");
        System.out.println("-->Numero enviado ... "+num);
        
        // try with resource only with non durable connections
        try (JMSContext m = cf.createContext()){
            m.createProducer().send(queue, (this.num*this.num));
            //m.createProducer().send(queue, m.createMessage());
        } catch (Exception e) {
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
}
