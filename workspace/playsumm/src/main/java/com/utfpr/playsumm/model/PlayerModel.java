/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.playsumm.model;

import com.utfpr.playsumm.interfaces.Player;
import com.utfpr.playsumm.interfaces.SimpleValidator;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author renan
 */
public class PlayerModel implements Player, Serializable {

    @NotEmpty(groups = SimpleValidator.class, message = "Informe um nome")
    @NotNull (groups = SimpleValidator.class, message = "Não é válido nullo para nome.")
    @NotBlank(groups = SimpleValidator.class, message = "Informe um nome, campo em branco !")
    @Size(min=3, max=20, groups = SimpleValidator.class, message = "Nome deve ter no mínimo 3 e no máximo 20 caracteres !")
    private String name;
    
    private int accruedPoint;
    private String sessionId;

    public PlayerModel() {
    }

    public PlayerModel(String name) {
        this.name = name;
    }

    public void storePoints() {
        this.accruedPoint++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccruedPoint() {
        return accruedPoint;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }



}
