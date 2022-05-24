package validador.formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * @author renan barbosa
   @apiNote Recebe os valores vindos do formulario  Class responsible to create form
*/	
public class BuildFormulario {
	
	private JTextField textFieldNome;
	private JTextField textFieldIdade;
	private JTextField textFieldEmail;
	private JTextField textFieldProfissao;
	
	private JLabel jLabelNome;
	private JLabel jLabelIdade;
	private JLabel jLabelEmail;
	private JLabel jLabelProfissao;

	/**
	 * @author renan barbosa
	   @param contentPane
	   @apiNote recieve context panel from class main  
	*/	
	public BuildFormulario(JPanel contentPane)
	{
		JLabel lblNewLabel = new JLabel("Valida formulário");
		lblNewLabel.setBounds(280, 72, 146, 15);
		contentPane.add(lblNewLabel);
		
		// field Nome
		jLabelNome = new JLabel("Nome");
		jLabelNome.setBounds(50, 50, 220, 220);
		textFieldNome = new JTextField();
		textFieldNome.setBounds(179, 117, 146, 19);
		contentPane.add(jLabelNome);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		// field idade
		jLabelIdade = new JLabel("Idade");
		jLabelIdade.setBounds(150, 150, 220, 220);
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(364, 117, 154, 19);
		contentPane.add(jLabelIdade);
		contentPane.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		// field email
		jLabelEmail = new JLabel("Email");
		jLabelEmail.setBounds(150, 150, 220, 220);
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(179, 146, 146, 19);
		contentPane.add(jLabelEmail);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		// field profissao
		jLabelProfissao = new JLabel("Profissão");
		jLabelProfissao.setBounds(150, 150, 220, 220);
		textFieldProfissao = new JTextField();
		textFieldProfissao.setBounds(364, 148, 154, 19);
		contentPane.add(jLabelProfissao);
		contentPane.add(textFieldProfissao);
		textFieldProfissao.setColumns(10);
		
		// button inserir
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setBounds(283, 206, 117, 25);
		contentPane.add(btnNewButton);
		
		listenButton(btnNewButton);
		
	}// BuildFormulario
	
	public void listenButton(JButton btnNewButton)
	{
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}//listenButton
	
}// BuildFormulario
