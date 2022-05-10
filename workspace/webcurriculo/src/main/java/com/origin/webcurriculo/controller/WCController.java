package com.origin.webcurriculo.controller;

import javax.inject.Inject;

import org.hibernate.Session;

import com.origin.webcurriculo.conn.ConnPgsql;
import com.origin.webcurriculo.interfaces.ConfigConnDBInterface;

/*
 * Entrega para toda aplicação configurações, resources, managed resource
 * 
 */
public class WCController implements ConfigConnDBInterface{

	@Inject
	private ConnPgsql connPgsql;
	
	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return connPgsql.getSession();
	}
	
}
