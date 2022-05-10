package com.teste.testspringplattaform.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class MyAppServlet implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		ServletRegistration.Dynamic reDynamic = servletContext.addServlet("dispatcher", new DispatcherServlet());
		
		reDynamic.setLoadOnStartup(1);
		reDynamic.addMapping("/mayapp/*");
		
		System.out.println("--> Class MyAppServlet, loaded");
	}

}
