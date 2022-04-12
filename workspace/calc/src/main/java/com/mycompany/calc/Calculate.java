/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * rest web service
 *
 * @author renan
 */
@Path("/")
public class Calculate {

    @GET
    @Produces("text/plain")
    @Path("resp/{param:.*}")
    public String respRest(@PathParam("param") String param) {

        return "REsposta rest text plain" + param;
    }
}
