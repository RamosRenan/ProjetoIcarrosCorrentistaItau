package com.correntista.dao;

import com.correntista.client.ClientCorrentista;
import com.correntista.validator.ValFormClient;

public class CrudClient 
{
	
	private ValFormClient validClient;

	public CrudClient() 
	{
		validClient =  new ValFormClient();
	}

	public boolean create(ClientCorrentista clientCorrentista) 
	{
		boolean created = false;

		return created;
	}

	public boolean update(long id)
	{
		boolean updated = false;
		
		return updated;
	}

	public boolean delete(long id)
	{
		boolean deleted = false;
		
		return deleted;
	}
}
