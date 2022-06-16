package com.icarros.panels;

import java.awt.BorderLayout;
<<<<<<< HEAD

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
>>>>>>> 2b1c308280b53b58bd9b47af0eb42e8ed0c3fa64

import com.icarros.abstracts.BaseWindowApp;
import com.icarros.components.AppJPanel;
import com.icarros.components.ButtonsAppUtils;
import com.icarros.components.Formulario;
import com.icarros.components.Tables;

<<<<<<< HEAD

/**
 * @author renan barbosa
 * 
 * @apiNote calsse responsavel por reunir componentes da IU
 * Esta classe é acionada por meio de interfaces 
 */
public class PanelJFrame extends BaseWindowApp {

	private Formulario formulario;

	private JFrame frame;

	private JScrollPane jTable;

	private ButtonsAppUtils buttonUtils;

	public PanelJFrame() {
		formulario = new Formulario();

		// crio instancia da classe tables para torna-la disponivel
		new Tables();

		// recupero a inatancia do formulario e envio para serer manipalado pelas ações
		// e eventos dos botões
		new ButtonsAppUtils(formulario);
	}

	/**
	 * @author renan barbosa
	 * 
	 *         crio componente JFrame como princpial da aplicação, componente pai de
	 *         toda aplicação
	 */
	@Override
	public JFrame createJFrameAppBase() {
=======
public class PanelJFrame extends BaseWindowApp{
	
	private Formulario formulario;
	
	private JFrame frame;
	
	private JScrollPane jTable;
	
	private ButtonsAppUtils buttonUtils;
	
	public PanelJFrame()
	{
		formulario = new Formulario();
		new Tables();
		new ButtonsAppUtils(formulario);
	}
		
	@Override
	public JFrame createJFrameAppBase() 
	{
>>>>>>> 2b1c308280b53b58bd9b47af0eb42e8ed0c3fa64
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setBounds(0, 0, 1220, 720);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		return frame;
	}

	/**
	 * @author renan barbosa
	 * 
<<<<<<< HEAD
	 *         metodo responsavel por reunir componentes na tela principal
	 */
	@Override
	public JPanel createJPanelAppBase() {
		// TODO Auto-generated method stub

		AppJPanel.jPanel.add(this.formulario.getLabel());

		AppJPanel.jPanel.add(this.formulario.getLabelDuration());
		AppJPanel.jPanel.add(this.formulario.getFieldDuration());

		AppJPanel.jPanel.add(this.formulario.getLabelGenero());
		AppJPanel.jPanel.add(this.formulario.getFieldGenero());

		AppJPanel.jPanel.add(this.formulario.getLabelNome());
		AppJPanel.jPanel.add(this.formulario.gettextFielNome());

		AppJPanel.jPanel.add(this.formulario.getLabelSinopse());
		AppJPanel.jPanel.add(this.formulario.getFieldSinopse());

		AppJPanel.jPanel.add(this.formulario.getLabelData());
		AppJPanel.jPanel.add(this.formulario.getFieldData());

		AppJPanel.jPanel.add(this.formulario.getFieldData());

		AppJPanel.jPanel.add(Tables.jScrollPane);

		AppJPanel.jPanel.add(ButtonsAppUtils.btnSair);
		AppJPanel.jPanel.add(ButtonsAppUtils.btnCreate);

		this.frame.add(AppJPanel.jPanel);

		return AppJPanel.jPanel;
	}

	public JPanel getJpanelApp() {
=======
	 * metodo responsavel por reunir componentes na tela principal
	 */
	@Override
	public JPanel createJPanelAppBase() 
	{
		// TODO Auto-generated method stub
		
		AppJPanel.jPanel.add(this.formulario.getLabel());
		
		AppJPanel.jPanel.add(this.formulario.getLabelDuration());
		AppJPanel.jPanel.add(this.formulario.getFieldDuration());
		
		AppJPanel.jPanel.add(this.formulario.getLabelGenero());
		AppJPanel.jPanel.add(this.formulario.getFieldGenero());
		
		AppJPanel.jPanel.add(this.formulario.getLabelNome());
		AppJPanel.jPanel.add(this.formulario.gettextFielNome());
		
		AppJPanel.jPanel.add(this.formulario.getLabelSinopse());
		AppJPanel.jPanel.add(this.formulario.getFieldSinopse());
		
		AppJPanel.jPanel.add(this.formulario.getLabelData());
		AppJPanel.jPanel.add(this.formulario.getFieldData());
		
		AppJPanel.jPanel.add(this.formulario.getFieldData());
		
		AppJPanel.jPanel.add(Tables.jScrollPane);
		
		AppJPanel.jPanel.add(ButtonsAppUtils.btnSair);
		AppJPanel.jPanel.add(ButtonsAppUtils.btnCreate);
		
		this.frame.add(AppJPanel.jPanel);
		
		return AppJPanel.jPanel;
	}
	
	public JPanel getJpanelApp() 
	{
>>>>>>> 2b1c308280b53b58bd9b47af0eb42e8ed0c3fa64
		return AppJPanel.jPanel;
	}
}
