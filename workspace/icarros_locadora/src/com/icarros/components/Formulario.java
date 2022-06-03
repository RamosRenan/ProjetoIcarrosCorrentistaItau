package com.icarros.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author renan barbosa
 *
 * Classe responsavel criar apenas componentes do formulario
 */
public class Formulario {
		
	// define lebals para os campos
	public  JLabel 	label;
	public  JLabel 	nome_filme;
	private JLabel 	duracao_filme;
	private JLabel 	genero_filme;
	private JLabel 	data_lacamento_filme;
	private JLabel	sinopse;
	
	// define os campos do form
	private JTextField field_nome_file;
	private JTextField filed_duracao_filme;
	private JTextField field_genero_filme;
	private JFormattedTextField field_data_lacamento_filme;
	private JTextField  area_field_sinopse;
	
	// constructor
	public Formulario()
	{
		
		// intancia de lebals
		label 					= new JLabel("Block and Buffer.");	
		nome_filme 				= new JLabel("Nome");
		duracao_filme 			=  new JLabel("Duração");
		genero_filme 			=  new JLabel("Genero");
		data_lacamento_filme 	=  new JLabel("Data de lançamento");
		sinopse 				=  new JLabel("Sinopse");
		
		// instacia fields
		field_nome_file  			=  new JTextField();
		filed_duracao_filme  		=  new JTextField();
		field_genero_filme  		=  new JTextField();
		DateFormat dateFormat = new SimpleDateFormat("dd MM YYYY");
		field_data_lacamento_filme  =  new JFormattedTextField(dateFormat);
		area_field_sinopse  		=  new JTextField();
		 
	}
	
	
	public JLabel getLabel()
	{
		this.label.setBounds(380, 10, 480, 80);
		this.label.setFont(new Font("Verdana", Font.PLAIN, 55));
		this.label.setForeground(new Color(240, 245, 242));
		this.label.setBackground(new Color(240, 245, 242));
		Border border = BorderFactory.createLineBorder(Color.ORANGE);
		this.label.setBorder(border);
		return this.label;
	}
	
	public JLabel getLabelNome()
	{
		this.nome_filme.setBounds(3, 30, 100, 50);
		this.nome_filme.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.nome_filme.setForeground(new Color(240, 245, 242));
		this.nome_filme.setBackground(new Color(240, 245, 242));
 		return this.nome_filme;
	}
	
	public JTextField gettextFielNome()
	{
		this.field_nome_file.setBounds(3, 70, 190, 20);
		return this.field_nome_file;
	}
	
	public JLabel getLabelDuration()
	{
		this.duracao_filme.setBounds(3, 80, 100, 50);
		this.duracao_filme.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.duracao_filme.setForeground(new Color(240, 245, 242));
		this.duracao_filme.setBackground(new Color(240, 245, 242));
 		return this.duracao_filme;
	}
	
	public JTextField getFieldDuration()
	{
		this.filed_duracao_filme.setBounds(3, 120, 190, 20);
 		return this.filed_duracao_filme;
	}
	
	public JLabel getLabelGenero()
	{
		this.genero_filme.setBounds(3,135, 100, 50);
		this.genero_filme.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.genero_filme.setForeground(new Color(240, 245, 242));
		this.genero_filme.setBackground(new Color(240, 245, 242));
 		return this.genero_filme;
	}
	
	public JTextField getFieldGenero()
	{
		this.field_genero_filme.setBounds(3, 175, 190, 20);
 		return this.field_genero_filme;
	}
	
	public JLabel getLabelData()
	{
		this.data_lacamento_filme.setBounds(3, 190, 250, 50);
		this.data_lacamento_filme.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.data_lacamento_filme.setForeground(new Color(240, 245, 242));
		this.data_lacamento_filme.setBackground(new Color(240, 245, 242));
 		return this.data_lacamento_filme;
	}
	
	public JFormattedTextField getFieldData()
	{
		this.field_data_lacamento_filme.setBounds(3, 235, 190, 20);
 		return this.field_data_lacamento_filme;
	}
	
	public JLabel getLabelSinopse()
	{
		this.sinopse.setBounds(3, 250, 100, 50);
		this.sinopse.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.sinopse.setForeground(new Color(240, 245, 242));
		this.sinopse.setBackground(new Color(240, 245, 242));
 		return this.sinopse;
	}
	

	public JTextField getFieldSinopse()
	{
		this.area_field_sinopse.setBounds(3, 290, 190, 50);
 		return this.area_field_sinopse;
	}
	
 }// class



