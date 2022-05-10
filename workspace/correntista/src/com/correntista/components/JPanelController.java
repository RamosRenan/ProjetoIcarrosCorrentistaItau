package com.correntista.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import com.correntista.singleton.jpanel.JPanelSingle;

/*
 * @Author Renan Barbosa
 *
 */
public class JPanelController extends JFrame 
{

	private static final long serialVersionUID = 1L;
	
	JPanel jPanel = new JPanel() {
		
		private static final long serialVersionUID = 1L;

		ImageIcon icon =  new ImageIcon("https://pngimage.net/wp-content/uploads/2018/06/png-elements-3.png");
		
		Image imageBackG = icon.getImage();
		
		
		/*
		 * @author renan barbosa
		 * 
		 * Place background image in JPnale
		 * 
		 */
		@Override
		public void paintComponent(Graphics g)
		{
			Graphics2D graphics2d = (Graphics2D) g;
			
			Path path = Paths.get("/correntista/min.jpg");
			
			FileInputStream fileInputStream = null;
			
			try {
				fileInputStream = new FileInputStream(path.getFileName().toString());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//InputStream imagestream = getClass().getResourceAsStream("../../resource/image/panelBackG.png");
			
			try {
				BufferedImage bufferedImage = ImageIO.read(fileInputStream);
				Image image = bufferedImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
				graphics2d.drawImage(image, 0, 0, this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.drawImage(imageBackG, 0, 0, this);
		}
	};
	
	public JPanelController() {
		super();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println(System.getProperty("java.class.path"));
		
		Path path = Paths.get("/correntista/resource/image/panelBackG.png");
		
		System.out.println(path.toString());
		System.out.println(path.isAbsolute());
	}

	public void startApp() throws IOException
	{
		jPanel.setPreferredSize(new Dimension(1080, 500));
		
		setJMenuBar(renderMenu());
		
		new LoginForm(jPanel);
		
		jPanel.setLayout(null);
		
		add(jPanel);

		setLocationRelativeTo(null);
		
		/*
		 * Devem ser as ultimas chamdas 
		 */
		pack();
		setVisible(true);
	}
	
	private JMenuBar renderMenu() 
	{
		return new MenuComponent();
	}
}
