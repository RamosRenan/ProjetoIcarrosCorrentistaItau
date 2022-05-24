package com.icarros.components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcJPanel {
	
	private JPanel contentPane;
	
	private JFrame container;
	
	public CalcJPanel(JPanel contentPane, JFrame container)
	{
		this.contentPane = contentPane;
		
		this.container = container;
		
		setPanelButton();
	}

	private void setPanelButton()
	{
		// jpanels para buttons
		JPanel panelButtons = new JPanel();
		panelButtons.setPreferredSize(new Dimension(200, 100));
		GridLayout gridLayout = new GridLayout(4, 3);
		gridLayout.setHgap(3);
		gridLayout.setVgap(3);
		panelButtons.setLayout(gridLayout);
		panelButtons.setBackground(Color.WHITE);
		contentPane.add(panelButtons);
		
		new CalcButtons(panelButtons, container);
		
		// japanels para texts
		JPanel panelTexts = new JPanel();
		GridLayout boxLayout = new GridLayout(6, 1);
		panelTexts.setLayout(boxLayout);
		contentPane.add(panelTexts);
		
		new CalcJtexts(panelTexts);
	}
}
