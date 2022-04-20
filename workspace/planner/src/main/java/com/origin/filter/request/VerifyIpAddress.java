/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.origin.filter.request;

import com.sun.net.httpserver.Filter.Chain;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import javax.ejb.Startup;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author renan
 */
//@WebFilter(filterName = "TimeOfDayFilter", urlPatterns = {"/app/*"})
public class VerifyIpAddress implements Filter {

    private final Logger logger = LogManager.getLogger();
    
    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        // get header from req and it ip
        if (!sr.getRemoteAddr().isEmpty()) {
            this.logger.info("--> Log4j says: request IP: " + sr.getRemoteAddr());
            System.out.println("--> System.out says: request IP: " + sr.getRemoteAddr());
        } else {
            this.logger.info("--> Log4j says: no ip found");
            System.out.println("--> System.out says: no ip found");
        }
        
        this.logger.info("--> next Log4j says: request IP: " + sr.getRemoteAddr());
        System.out.println("--> next System.out says: request IP: " + sr.getRemoteAddr());
    }
}
