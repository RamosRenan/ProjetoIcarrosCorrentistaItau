package com.correntista.singleton.jpanel;

import javax.swing.JPanel;

public class JPanelSingle {
	
	
	private static JPanel J_P;
	
	/**
	 * @author renan barbosa
	 * 
	 * Permite usar o janel principal em toda aplicação sem modifica-lo 
	 */
	static final JPanel JPANEL = JPanelSingle.jPanelSingle();
	
	
	public JPanelSingle(JPanel jp)
	{
		JPanelSingle.J_P = jp;
	}
	
	private static JPanel jPanelSingle()
	{
		return JPanelSingle.J_P;
	}
	
	public static JPanel getJP()
	{
		return JPanelSingle.JPANEL;
	}
}
