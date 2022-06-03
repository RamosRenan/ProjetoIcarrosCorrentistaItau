package com.icarros.abstracts;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class BaseWindowApp implements com.icarros.interfaces.BaseWindowApp{
 	public abstract JFrame createJFrameAppBase();
 	public abstract JPanel createJPanelAppBase(); 
 	public abstract JPanel getJpanelApp();
}
