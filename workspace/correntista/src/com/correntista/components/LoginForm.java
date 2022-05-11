package com.correntista.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginForm implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	
	private final String ACTION_PERFORM_LOGIN = "actionPerformLogin";
	private final String ACTION_PERFORM_PASS = "actionPerformPass";

	private final JLabel J_LABEL_LOGIN = new JLabel("Login: ");
	private final JLabel J_LABEL_PASS = new JLabel("Password: ");
	
	private JTextField fieldLogin = new JTextField(10);
 	private JPasswordField fieldPass = new JPasswordField(10);
	
	JButton button =  new JButton("Save");
	
	Path path = Paths.get("/correntista/save.png");
	
	FileInputStream fileInputStream = null;
	
	JPanel jPanel = null;
	
	public LoginForm(JPanel jPanel) throws IOException
	{		
		this.jPanel = jPanel;
		
		preparForm();
		
		setBackgroundImg();
		
		addFormInJpanel();
	}
	
	private void addFormInJpanel()
	{
		JPanel jPanel2 = new JPanel();
		jPanel2.setPreferredSize(new Dimension(300, 120));		
		jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
		jPanel2.setSize(new Dimension(300, 120));
		jPanel2.setLocation(100, 100);
		jPanel2.setBackground(new Color(0,0,0, 0.0f));
		jPanel2.add(J_LABEL_LOGIN );
		jPanel2.add(fieldLogin );
		jPanel2.add(J_LABEL_PASS );
		jPanel2.add(fieldPass);
		jPanel2.add(this.button);
		jPanel2.setBorder(BorderFactory.createTitledBorder("Acesse"));
		jPanel2.setBounds(540 - (jPanel2.getWidth()/2), 200, jPanel2.getWidth(), jPanel2.getHeight());
		
		this.jPanel.add(jPanel2);
	}
	
	private void setBackgroundImg() throws IOException
	{
		fileInputStream = new FileInputStream(this.path.getFileName().toString());
		
		BufferedImage bufferedImage = ImageIO.read(fileInputStream);		
		
		Image image =  bufferedImage.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		ImageIcon icon = new ImageIcon(image);
		
		this.button.setIcon(icon);
		
		this.fieldLogin.addActionListener(this);
	}
	
	private void preparForm()
	{
		this.J_LABEL_LOGIN.setLabelFor(fieldLogin);
		this.J_LABEL_PASS.setLabelFor(fieldPass);
		
		this.fieldLogin.setActionCommand(ACTION_PERFORM_LOGIN);
		this.fieldPass.setActionCommand(ACTION_PERFORM_PASS);
		
		this.fieldLogin.addActionListener(this);
		this.fieldPass.addActionListener(this);
		
		//this.button.setMnemonic(KeyEvent.VK_D);
		this.button.setActionCommand("login");
		this.button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub		

		if("login".equals(e.getActionCommand()))
		{
			String txtLogin = this.fieldLogin.getText();
			//System.out.println("Realizando login ... "+txtLogin+" "+Arrays.toString(this.fieldPass.getPassword()));	
			
			authUser();
		}
	}
	
	private boolean authUser()
	{
		return false;
	}
}
