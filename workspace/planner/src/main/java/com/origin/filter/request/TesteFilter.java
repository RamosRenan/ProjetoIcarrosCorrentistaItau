/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.origin.filter.request;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author renan
 */
@Path("/")
public class TesteFilter {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @GET
    @Path("app")
    @Produces("text/plain")
    public String testFilter()
    {
        return "você testou um filtro !";
    }
}
