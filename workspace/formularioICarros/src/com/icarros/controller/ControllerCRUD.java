package com.icarros.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

import com.icarros.data.Data;

public class ControllerCRUD {
	
	public String[][] data;
	
	public String[][] read()
	{
		
		Iterator<String[]> iteratorData = Data.listData.iterator();
		
		String[][] ddProvisory = new String[Data.listData.size()][];
		
		int index = 0;
		while(iteratorData.hasNext()) {
			ddProvisory[index] = iteratorData.next();
		}
		
		
		return data = ddProvisory;
	}
	
	public void create(String id, String nome, String email, String idade)
	{
		String[] stringss = {id, nome, email, idade};
		
		Data.listData.add(stringss);
		
		Iterator<String[]> iterator = Data.listData.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println("--> "+Arrays.toString(iterator.next()));
		}
		
	}

}



