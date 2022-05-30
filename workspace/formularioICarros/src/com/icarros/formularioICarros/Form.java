package com.icarros.formularioICarros;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.icarros.components.ButtonsForm;
import com.icarros.components.FormElements;
import com.icarros.controller.ControllerCRUD;
import com.icarros.validateForm.ValidateForm;

public class Form extends JFrame {

	private JPanel contentPane;
	
	private JTable jTable;
	
	private DefaultTableModel dfModelTable;
	
	Object[][] data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		FormElements elements = new FormElements();
		
		// add field ens label id
		contentPane.add(elements.getTextFieldId());
		contentPane.add(elements.getLabelId());
		
		// add field and label nome
		contentPane.add(elements.getLabelNome());
		contentPane.add(elements.getTextFieldNome());
		
		// add field and label email
		contentPane.add(elements.getTextFieldEmail());
		contentPane.add(elements.getLabelEmail());
		
		// add field and idade
		contentPane.add(elements.getLabelIdade());
		contentPane.add(elements.getTextFieldIdade());
		
		ButtonsForm buttonsForm =  new ButtonsForm();
		
		// add button create update delete read
		contentPane.add(buttonsForm.getButtonCreate());
		contentPane.add(buttonsForm.getButtonUpdate());
		contentPane.add(buttonsForm.getButtonDelete());
		contentPane.add(buttonsForm.getButtonRead());
		
		// header table columns
		String[] columnNames = {elements.getLabelId().getText(), elements.getLabelNome().getText(), elements.getLabelEmail().getText(), elements.getLabelIdade().getText()};
		
		this.jTable = new JTable(new DefaultTableModel(null, columnNames));
		
		JScrollPane jScrollPane = new JScrollPane(jTable);
		
		jScrollPane.setBounds(80, 160, 500, 280);
		
		contentPane.add(jScrollPane);		
		
		this.dfModelTable = (DefaultTableModel) jTable.getModel();
		
		setContentPane(contentPane);
		
		
		buttonsForm.getButtonCreate().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(new ValidateForm(elements.getTextFieldId().getText(), elements.getTextFieldNome().getText(), 
						elements.getTextFieldEmail().getText(), elements.getTextFieldIdade().getText()).isValidForm())
				{
					System.out.println("--> formulário válido ...");
					new ControllerCRUD().create(elements.getTextFieldId().getText(), elements.getTextFieldNome().getText(), 
							elements.getTextFieldEmail().getText(), elements.getTextFieldIdade().getText());
					atualizaTable();
				}
			}
		});
	}
	
	public void atualizaTable()
	{
		ControllerCRUD controllerCRUD = new ControllerCRUD();
		
		for (int i = 0; i < controllerCRUD.read().length; i++) {
			System.out.println("-->add row "+Arrays.toString(controllerCRUD.read()[i]));
			this.dfModelTable.addRow(controllerCRUD.read()[i]);		
		}
	}

}
