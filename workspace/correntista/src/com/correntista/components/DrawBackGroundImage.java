package com.correntista.components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawBackGroundImage extends JPanel{
	
	ImageIcon icon =  new ImageIcon("https://pngimage.net/wp-content/uploads/2018/06/png-elements-3.png");
	
	Image imageBackG = icon.getImage();
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawImage(imageBackG, 0, 0, this);
	}
}
