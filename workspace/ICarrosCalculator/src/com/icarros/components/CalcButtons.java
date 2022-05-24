package com.icarros.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.icarros.controller.Operacao;
import com.icarros.strings.constants.StringsApp;

/*
 * Just responsible to create buttons e operation with buttons*/
public class CalcButtons {

	public JButton jbutton_0;
	public JButton jbutton_1;
	public JButton jbutton_2;
	public JButton jbutton_3;
	public JButton jbutton_4;
	public JButton jbutton_5;
	public JButton jbutton_6;
	public JButton jbutton_7;
	public JButton jbutton_8;
	public JButton jbutton_9;

	// buttons comands
	public JButton jbutton_Soma;
	public JButton jbutton_Subtrai;
	public JButton jbutton_Divide;
	public JButton jbutton_Multiplica;
	public JButton jbutton_Igual;
	public JButton jbutton_Resto;
	public JButton jbutton_Clean;

	private JFrame container;

	private Operacao operacao;

	public CalcButtons(JPanel panelButtons, JFrame container) {
		this.container = container;

		this.operacao = new Operacao();

		jbutton_0 = new JButton("0");
		jbutton_1 = new JButton("1");
		jbutton_2 = new JButton("2");
		jbutton_3 = new JButton("3");
		jbutton_4 = new JButton("4");
		jbutton_5 = new JButton("5");
		jbutton_6 = new JButton("6");
		jbutton_7 = new JButton("7");
		jbutton_8 = new JButton("8");
		jbutton_9 = new JButton("9");

		jbutton_Soma 	= new JButton("+");
		jbutton_Subtrai = new JButton("-");
		jbutton_Divide 	= new JButton("/");
		jbutton_Multiplica 	= new JButton("*");
		jbutton_Igual 		= new JButton("=");
		jbutton_Resto 		= new JButton("% R");

		jbutton_Clean = new JButton("C");

		panelButtons.add(jbutton_0);
		panelButtons.add(jbutton_1);
		panelButtons.add(jbutton_2);
		panelButtons.add(jbutton_3);
		panelButtons.add(jbutton_4);
		panelButtons.add(jbutton_5);
		panelButtons.add(jbutton_6);
		panelButtons.add(jbutton_7);
		panelButtons.add(jbutton_8);
		panelButtons.add(jbutton_9);

		panelButtons.add(jbutton_Divide);
		panelButtons.add(jbutton_Soma);
		panelButtons.add(jbutton_Subtrai);
		panelButtons.add(jbutton_Multiplica);
		panelButtons.add(jbutton_Igual);
		panelButtons.add(jbutton_Resto);
		panelButtons.add(jbutton_Clean);
		panelButtons.add(new JButton());
		panelButtons.add(new JButton());
		panelButtons.add(new JButton());

		listenButtons();
	}

	private void listenButtons() {

		// listen button 1
		jbutton_0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_0);
//						JOptionPane.showMessageDialog(container, "ola jbutton 1");
			}
		});

		// listen button 1
		jbutton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_1);
//				JOptionPane.showMessageDialog(container, "ola jbutton 1");
			}
		});

		// listen button 2
		jbutton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_2);
//				JOptionPane.showMessageDialog(container, "ola jbutton 2");
			}
		});

		// listen button 3
		jbutton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_3);
//				JOptionPane.showMessageDialog(container, "ola jbutton 3");
			}
		});

		// listen button 4
		jbutton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_4);
//				JOptionPane.showMessageDialog(container, "ola jbutton 4");
			}
		});

		// listen button 5
		jbutton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_5);
//				JOptionPane.showMessageDialog(container, "ola jbutton 5");
			}
		});

		// listen button 6
		jbutton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_6);
//				JOptionPane.showMessageDialog(container, "ola jbutton 6");
			}
		});

		// listen button 7
		jbutton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_7);
//				JOptionPane.showMessageDialog(container, "ola jbutton 7");

			}
		});
		// listen button 8
		jbutton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_8);
//				JOptionPane.showMessageDialog(container, "ola jbutton 8");
			}
		});

		// listen button 9
		jbutton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_9);
//				JOptionPane.showMessageDialog(container, "ola jbutton 9");
			}
		});

		// listen button +
		jbutton_Soma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_SOMA);
//				JOptionPane.showMessageDialog(container, "ola jbutton soma");
			}
		});

		// listen button -
		jbutton_Subtrai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_SUB);
//				JOptionPane.showMessageDialog(container, "ola jbutton sub");
			}
		});

		// listen button /
		jbutton_Divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_DIVID);
//				JOptionPane.showMessageDialog(container, "ola jbutton divid");
			}
		});

		// listen button %
		jbutton_Resto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_RESTO);
//				JOptionPane.showMessageDialog(container, "ola jbutton resto");
			}
		});

		// listen button *
		jbutton_Multiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_MULTIPLICA);
//				JOptionPane.showMessageDialog(container, "ola jbutton multiplica");
			}
		});

		// listen button =
		jbutton_Igual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CalcJtexts.jTextField.setText(CalcJtexts.jTextField.getText()+" "+String.valueOf(operacao.getResult()));
//				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_IGUAL);
//				JOptionPane.showMessageDialog(container, "ola jbutton igual");
			}
		});

		// listen button clean
		jbutton_Clean.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operacao.putTextIntoJTextFieldScreen(StringsApp.BUTTON_CLEAN);
//				JOptionPane.showMessageDialog(container, "ola jbutton clean");
			}
		});
	}
}
