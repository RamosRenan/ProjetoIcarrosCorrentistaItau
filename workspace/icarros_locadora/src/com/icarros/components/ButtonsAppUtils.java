package com.icarros.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.icarros.conn.mysql.StartApp;
import com.icarros.entityes.Filme;
import com.icarros.general.StringsUtils;
import com.icarros.validator.Validator;

/**
 * @author renan barbosa
 * 
 * Classe responsavel por criar e devolver apenas os mennus
 *
 */
public class ButtonsAppUtils{
	
	public static JButton btnCreate;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnAlter;
	public  static JButton btnSair;	
	private Filme filme;
	private Validator validator;
	
	public ButtonsAppUtils(Formulario formulario)
	{
		this.btnDelete =  new JButton(StringsUtils.BTN_DELETE);
		this.btnUpdate =  new JButton(StringsUtils.BTN_UPDATE);
		this.btnAlter  =  new JButton(StringsUtils.BTN_ALTER);
		
		// btn saircom configuraçoes de layout
		ButtonsAppUtils.btnCreate =  new JButton(StringsUtils.BTN_CREATE);
		ButtonsAppUtils.btnCreate.setToolTipText("Inserir");
		ButtonsAppUtils.btnCreate.setBounds(100, 638, 150, 40);
		ButtonsAppUtils.btnCreate.setActionCommand("Sair");		
		ButtonsAppUtils.btnCreate.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" --> Pressionou btn inserir !");
				filme = new Filme();
				validator = new Validator(formulario);
				if(validator.isValid())
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(StartApp.jFrameBaseWindowApp.getJpanelApp(), validator.getMessage(), "Campo not match", JOptionPane.WARNING_MESSAGE);
				}
					
				System.out.println("--> "+formulario.gettextFielNome().getText());
				
			}
		});
		
		// btn sair com configuraçoes de layout
		ButtonsAppUtils.btnSair   =  new JButton(StringsUtils.BTN_SAIR);
		ButtonsAppUtils.btnSair.setToolTipText("Sair do app");
		ButtonsAppUtils.btnSair.setBounds(10, 638, 65, 40);
		ButtonsAppUtils.btnSair.setActionCommand("Sair");		
		ButtonsAppUtils.btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Pressionou btn sair !");
				System.exit(0);
			}
		});
	}
	
	public JButton getBtnCreate()
	{
		this.btnCreate.setBounds(0, 0, 100, 40);
		return this.btnCreate;
	}
	
	public JButton getBtnSair()
	{
		this.btnSair.setBounds(10, 638, 65, 40);
		return this.btnSair;
	}
}
