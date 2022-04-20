/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.origin.messagedb.sr;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.Queue;

/**
 *
 * @author renan
 */
@Named(value = "recive")
@RequestScoped
public class Recive {

    /**
     * Creates a new instance of Recive
     */
    public Recive() {
    }

    @Inject
    private JMSContext context;
    
    @Resource(lookup = "java/Fila")
    private Queue queue;

    public void mess() {
        try {
            JMSConsumer receiver = context.createConsumer(queue);
            String text = receiver.receiveBody(String.class);

            if (text != null) {
                FacesMessage facesMessage
                        = new FacesMessage("Reading message: " + text);
                FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            } else {
                FacesMessage facesMessage
                        = new FacesMessage("No message received after 1 second");
                FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            }
        } catch (Throwable t) {
            t.getCause();
        }
    }
}
