package com.correntista.components;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/*
 * @Author Renan Barbosa
 *
 */
public class MenuComponent extends JMenuBar
{

	private static final long serialVersionUID = 1L;

	public MenuComponent()
	{
		super();
		constructMenu();
	}
	
	private void constructMenu()
	{
		JMenu bar = new JMenu("A menu");
		bar.setMnemonic(KeyEvent.VK_A);
		bar.getAccessibleContext().setAccessibleDescription("Um menu qualquer");
		setBackground(new Color(231, 228, 228));		
		setBorderPainted(true);
		
		
		add(bar);
	}
}
