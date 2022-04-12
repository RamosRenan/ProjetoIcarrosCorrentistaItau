/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatecalendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * REST web service
 *
 * @author renan
 */
@Path("/")
public class Calendar {

    @GET
    @Produces("text/plain")
    @Path("convert/{inDate : .*}")
    public String convert(@PathParam("inDate") String inDate) {
        String resposta = "o valor passadi no parâmetro é: " + inDate;

        return resposta;
    }
}
