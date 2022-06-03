package com.icarros.conn.mysql;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.icarros.components.ButtonsAppUtils;
import com.icarros.components.Formulario;
import com.icarros.interfaces.BaseWindowApp;
import com.icarros.panels.PanelJFrame;

/**
 * @author dev.: renan barbosa 1jun 22
 * 
 * class principal para reunir os componentes da aplicação
 * 
 */
public class StartApp{
	
	// interface jFrameBaseWindowApp recebe filho q implementa pai
	public static BaseWindowApp jFrameBaseWindowApp = new PanelJFrame(); 
	
	public StartApp(){}
	
	/**
	 * @author renan barbosa
	 * 
	 *  metodo responsavel por chamar atraves da interface os criadores da tela
	 */
	public void start()
	{
		jFrameBaseWindowApp.createJFrameAppBase();
		jFrameBaseWindowApp.createJPanelAppBase();
	}
	
}
