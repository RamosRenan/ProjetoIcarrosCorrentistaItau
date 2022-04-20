/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package com.origin.planner.conn;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author renan
 */
@Startup
@Singleton
public class ConnectionDB{

    private final Logger logger;
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public ConnectionDB() {
        this.logger = LogManager.getLogger();
        this.logger.info("Contruindo ConnectionDB");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    @PostConstruct
    private void createEntityManager()
    {
        emf = Persistence.createEntityManagerFactory("postgresql");
        em = emf.createEntityManager();
        if(em.isOpen())
        {
            logger.info("Connection created ...");
        }
        System.out.println("Connection created ...");
    }
     
}
