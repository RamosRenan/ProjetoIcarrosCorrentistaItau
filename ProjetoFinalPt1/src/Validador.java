import java.util.Scanner;

// cont�m todas as fun��es para validar as entradas de usu�rio
public class Validador {
	
	private boolean valido;
	private String mensagemErro;
	
	// Regex para cada campo
	// apenas UM n�mero entre 1 e 5
	private String escolhaRegex = "^[1-5]{1}$";
	// um ou mais n�meros entre 0 e 9
	private String numRegex = "^[0-9]+$";
	// no m�nimo um @ no meio de qualquer caracter pros dois lados
	private String emailRegex = "^\\S+@\\S+$";
	// filtra qualquer n�mero
	private String nomeRegex = "^\\D+$";
	
	public Validador() {
		this.valido = true;
		this.mensagemErro = "";
	}
	
	public void validarMenu(String escolha) {
		
		if (!escolha.matches(this.escolhaRegex)) {
			this.valido = false;
			this.mensagemErro = "Escolha uma op��o do menu.";
		}
	}
	
	// para campos que n�o aceitam n�meros
	public void validarNome(String nome) {
		
		if (!nome.matches(this.nomeRegex)) {
			this.valido = false;
			this.mensagemErro = "N�o � permitido n�meros.";
		}
	}
	
	// para campos como conta e ag�ncia
	public void validarApenasNumeros(String campo) {
		
		if (!campo.matches(this.numRegex)) {
			this.valido = false;
			this.mensagemErro = "Entrada inv�lida. Informe somente n�meros.";
		}
	}
	
	// apenas verifico estrutura b�sica: xxxx@xxxx
	public void validarEmail(String email) {
		
		if(!email.matches(this.emailRegex)) {
			this.valido = false;
			this.mensagemErro = "Entre com um email v�lido.";
		}
	}
	
	public void validarSaldo(String saldo) {

		try {
			Double.parseDouble(saldo);
		} catch (Exception e) {
			this.valido = false;
			this.mensagemErro = "Saldo inv�lido. informe apenas valores.";
		}
		
	}
	
	// fun��o para fazer o loop de entrada caso campo seja vazio
	public boolean campoVazio(String campo) {
		
		if (campo.isBlank()) {
			System.out.println("Campo n�o pode ser vazio, favor digitar novamente:");
			return true;
		} else {
			return false;
		}
	}
	
	// retorna estado de valida��o e mensagem de erro caso falso
	public boolean estaValido() {
		
		if (!this.valido) {
			System.out.println(this.mensagemErro);
		}
		
		return this.valido;
	}
	
}
