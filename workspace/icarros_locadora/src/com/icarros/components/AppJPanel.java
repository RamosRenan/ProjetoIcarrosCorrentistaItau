package com.icarros.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * @author renan barbosa
 * 
 * classe responsavel por criar jpanel que irá reuniar todos os componentes da app principal 
 */
public class AppJPanel{	
 	
	/**
	 * responsavel por sobreescrever o método paintComponent
	 */
	 public static JPanel jPanel = new JPanel(null) {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g)
		{			
			Graphics2D graphics2d =  (Graphics2D) g; 
			
			FileInputStream fileInputStream = null;
			
			Path path = null;
			
			try {
				 path = Paths.get("/home/renan/Ambiente/Java/workspace/icarros_locadora/images/banner.jpg");
				 System.out.println(" --> Criando img  path "+path.toString());
			} catch (Exception e) {
				// TODO: handle exception
				e.getCause();
				e.getMessage();
			}
			
			try {
				fileInputStream = new FileInputStream(path.toString());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			BufferedImage bufferedImage = null;
			
			try {
				bufferedImage =  ImageIO.read(fileInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Image image =  bufferedImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
			
			System.out.println(" --> background is seted ! ");
			
			graphics2d.drawImage(image, 0, 0, this);
			
			this.setBounds(0, 0, 1220, 720);
			
			this.setVisible(true);		
			
		}
		
	};
	
	public AppJPanel()
	{
		System.out.println(" --> Criando jpanel ! ");	
		AppJPanel.jPanel.setBackground(Color.BLACK);
		AppJPanel.jPanel.setBounds(0, 0, 1220, 720);
		
		
 	}
}
