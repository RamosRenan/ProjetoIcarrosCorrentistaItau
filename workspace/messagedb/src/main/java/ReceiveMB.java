/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.TextMessage;

/**
 *
 * @author renan
 */
@JMSDestinationDefinition(
        name = "java/Fila",
        interfaceName = "jakarta.jms.Queue",
        destinationName = "resourceMessage")
@Named(value = "receiveMB")
@RequestScoped
public class ReceiveMB {
    
    private String mensagem;

    /**
     * Creates a new instance of ReceiveMB
     */
    public ReceiveMB() {
    }
    
    @Inject
    private JMSContext context;

    public String getMensagem() {
        return mensagem;
    }
    
    @Resource(lookup = "java/Fila")
    private Queue queue;
    
    public void getReceive() throws JMSException
    {
        JMSConsumer consumer = context.createConsumer(queue);
        
        this.mensagem =  ((TextMessage)consumer.receive()).getText();
        
        //this.mensagem = textMessage.getText();
    }
}
