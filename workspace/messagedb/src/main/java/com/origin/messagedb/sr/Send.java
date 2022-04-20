package com.origin.messagedb.sr;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.util.logging.Level;
import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.Queue;

/**
 *
 * @author renan
 */
@JMSDestinationDefinition(
        name = "java/Fila",
        interfaceName = "jakarta.jms.Queue",
        destinationName = "resourceMessage")
@Named(value = "send")
@RequestScoped
public class Send {

    /**
     * Creates a new instance of Send
     */
    public Send() {
    }

    @Inject
    private JMSContext context;
    
    @Resource(lookup = "java/Fila")
    private Queue queue;
    
    private String messageText;

    public void sendMessage() {
        try {
            String text = "Message from producer: ";
            context.createProducer().send(queue, text);

            FacesMessage facesMessage
                    = new FacesMessage("Sent message: " + text);
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        } catch (Throwable t) {
            t.getCause();
        }
    }

}
