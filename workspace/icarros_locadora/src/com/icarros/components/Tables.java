package com.icarros.components;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tables {
	
	public static JTable jTableApp;
	
	public static JScrollPane jScrollPane;
	
	public Tables()
	{
		String[] columns = {"col 1", "col 2", "col 3"};
		
		jTableApp = new JTable(new DefaultTableModel(null, columns));
		
		jScrollPane = new JScrollPane(jTableApp);
		
		jScrollPane.setBounds(5, 400, 1210, 230);
	}
}
