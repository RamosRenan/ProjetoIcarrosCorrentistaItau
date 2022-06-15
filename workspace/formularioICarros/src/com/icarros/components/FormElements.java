package com.icarros.components;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormElements {
	
	private JLabel idlabel;
	private JLabel nomeLabel;
	private JLabel emailLabel;
	private JLabel idadeLabel;
	
	private JTextField id;
	private JTextField nome;
	private JTextField email;
	private JTextField idade;
	
	public FormElements()
	{
		// label and field id
		this.idlabel = new JLabel("Id");
		this.idlabel.setBounds(60, 20, 20, 20);
		this.id 	= new JTextField(35);		
		this.id.setBounds(80, 20, 50, 20);
		
		// label and field nome
		this.nomeLabel = new JLabel("Nome");
		this.nomeLabel.setBounds(28, 45, 50, 20);
		this.nome 	= new JTextField();
		this.nome.setBounds(80, 45, 150, 20);
		
		// label and field email
		this.emailLabel =  new JLabel("email");
		this.emailLabel.setBounds(28, 70, 80, 20);
		this.email 	= new JTextField();
		this.email.setBounds(80, 70, 150, 20);
		
		// label and field idade
		this.idadeLabel = new JLabel("Idade");
		this.idadeLabel.setBounds(28, 95, 40, 20);
		this.idade 	= new JTextField();
		this.idade.setBounds(80, 95, 150, 20);
	}
	
	// id
	public JLabel getLabelId()
	{
		return this.idlabel;
	}
	
	public JTextField getTextFieldId()
	{
		return this.id;
	}
	
	// nome
	public JLabel getLabelNome()
	{
		return this.nomeLabel;
	}
	
	public JTextField getTextFieldNome()
	{
		return this.nome;
	}

	// email
	public JLabel getLabelEmail()
	{
		return this.emailLabel;
	}
	
	
	public JTextField getTextFieldEmail()
	{
		return this.email;
	}
	
	// idade
	public JTextField getTextFieldIdade()
	{
		return this.idade;
	}
	
	public JLabel getLabelIdade()
	{
		return this.idadeLabel;
	}
}



