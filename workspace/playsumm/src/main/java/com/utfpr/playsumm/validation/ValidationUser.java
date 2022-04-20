/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsumm.validation;

import com.utfpr.playsumm.interfaces.SimpleValidator;
import com.utfpr.playsumm.model.PlayerModel;
import java.util.Iterator;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.*;

/**
 *
 * @author renan
 */
public class ValidationUser {
    
    private Validator validator;
    private Set<ConstraintViolation<PlayerModel>> constraintViolations;
    
    public ValidationUser(PlayerModel playerModel)
    {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
        
        constraintViolations = validator.validate(playerModel, SimpleValidator.class);       
       
    }
    
    public boolean vilidForm()
    {
        boolean valid = false;
        Iterator<ConstraintViolation<PlayerModel>> iterator = constraintViolations.iterator();
        
        if(!constraintViolations.isEmpty())
        {
            valid = true;
            System.out.println("--> Set<ConstraintViolation<PlayerModel>>:"+constraintViolations.size());
        }
        
        String message = null; 
        while(iterator.hasNext())
        {
            ConstraintViolation<PlayerModel> cv = iterator.next();
            System.out.println("--> Invalid value:"+cv.getMessage());
            message = cv.getMessage();
        }
        
        FacesMessage facesMessage = new FacesMessage(message); 
        FacesContext.getCurrentInstance().addMessage("myform:userName", facesMessage);
        
        return valid;
    }
    
    
}
