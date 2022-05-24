package validador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import validador.formulario.BuildFormulario;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

/*
	Nome
	Idade
	Email
	Profissão
	
	1º) Fazer a validação de todos os campos como obrigatório
	2º) no campo idade não pode entrar caracteres
	3º) Ao clicar no botão gravar 
	gravar a informação em um arquivo txt
	dados.txt
	Precisa estar na mesma pasta da sua aplicação 
	4º) Limpar os campos
	5º) Posiciona o cursor e permite inserir um novo registro
*/
public class Validador extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Validador frame = new Validador();
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
	public Validador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		// call class responsible to create form
		new BuildFormulario(contentPane);
	}
}
