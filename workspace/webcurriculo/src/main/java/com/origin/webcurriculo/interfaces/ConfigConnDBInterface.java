package com.origin.webcurriculo.interfaces;

import org.hibernate.Session;

import com.origin.webcurriculo.conn.ConnPgsql;

public interface ConfigConnDBInterface {
	public Session getSession();
}
