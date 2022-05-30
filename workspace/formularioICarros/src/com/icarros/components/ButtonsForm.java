package com.icarros.components;

import javax.swing.JButton;

public class ButtonsForm {
	
	private JButton buttonCreate;
	private JButton buttonUpdate;
	private JButton buttonDelete;
	private JButton buttonRead;
	
	public ButtonsForm()
	{
		this.buttonCreate = new JButton("Create");
		this.buttonUpdate = new JButton("Update");
		this.buttonDelete = new JButton("Delete");
		this.buttonRead   = new JButton("Read");
		
		this.buttonCreate.setBounds(80, 125, 120, 20);
		this.buttonUpdate.setBounds(200, 125, 120, 20);
		this.buttonDelete.setBounds(320, 125, 120, 20);
		this.buttonRead.setBounds(440, 125, 120, 20);
	}
	
	public JButton getButtonCreate()
	{
		return this.buttonCreate;
	}
	
	public JButton getButtonUpdate()
	{
		return this.buttonUpdate;
	}
	
	public JButton getButtonDelete()
	{
		return this.buttonDelete;
	}
	
	public JButton getButtonRead()
	{
		return this.buttonRead;
	}

}
