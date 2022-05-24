package com.icarros.components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class CalcJtexts {
	
	public static JTextField jTextArea;
	
	public static JTextField jTextField;
	
	public static JLabel jLabelDownloadFileJLabel;
	
	CalcJtexts(JPanel panelTexts)
	{
		jTextArea = new JTextField();
		jTextArea.setRequestFocusEnabled(true);
		panelTexts.add(jTextArea);
		
		panelTexts.add(new JSeparator());
		
		jTextField = new JTextField();	
		jTextField.setEnabled(false);
		jTextField.setAlignmentY(0);
		jTextField.setText(" Resultado: ");
		panelTexts.add(jTextField);
		
		panelTexts.add(new JLabel(" "));
		
		jLabelDownloadFileJLabel = new JLabel("Download histórico");
		jLabelDownloadFileJLabel.setHorizontalAlignment(0);
		jLabelDownloadFileJLabel.setForeground(Color.BLUE);
		jLabelDownloadFileJLabel.setFont(new Font(null, 0, 11));
		panelTexts.add(jLabelDownloadFileJLabel);
	}

}
