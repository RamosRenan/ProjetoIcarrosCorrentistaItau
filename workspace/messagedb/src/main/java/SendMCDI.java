/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import com.origin.messagedb.SendMessage;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author renan
 */
@Named(value = "sendMCDI")
@RequestScoped
public class SendMCDI {

    /**
     * Creates a new instance of SendMCDI
     */
    public SendMCDI() {
    }
    
    @EJB
    private SendMessage sendMessage;
    
    public void send()
    {
        sendMessage.send();
    }
    
}
