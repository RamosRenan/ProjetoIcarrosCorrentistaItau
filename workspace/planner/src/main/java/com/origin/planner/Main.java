/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.origin.planner;

import com.origin.planner.conn.ConnectionDB;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author renan
 */
public class Main {

    static {
        new Main();
    }

    @EJB
    private ConnectionDB cdb;

    private String msn = cdb.toString();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Logger logger;
        logger = LogManager.getLogger();
        logger.info("Main class call");
        System.out.println("Main class call");
    }

}
