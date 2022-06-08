import java.util.Scanner;

// contém todas as funçöes para validar as entradas de usuário
public class Validador {
	
	private boolean valido;
	private String mensagemErro;
	
	// Regex para cada campo
	// apenas UM número entre 1 e 5
	private String escolhaRegex = "^[1-5]{1}$";
	// um ou mais números entre 0 e 9
	private String numRegex = "^[0-9]+$";
	// no mínimo um @ no meio de qualquer caracter pros dois lados
	private String emailRegex = "^\\S+@\\S+$";
	// filtra qualquer número
	private String nomeRegex = "^\\D+$";
	
	public Validador() {
		this.valido = true;
		this.mensagemErro = "";
	}
	
	public void validarMenu(String escolha) {
		
		if (!escolha.matches(this.escolhaRegex)) {
			this.valido = false;
			this.mensagemErro = "Escolha uma opção do menu.";
		}
	}
	
	// para campos que não aceitam números
	public void validarNome(String nome) {
		
		if (!nome.matches(this.nomeRegex)) {
			this.valido = false;
			this.mensagemErro = "Não é permitido números.";
		}
	}
	
	// para campos como conta e agência
	public void validarApenasNumeros(String campo) {
		
		if (!campo.matches(this.numRegex)) {
			this.valido = false;
			this.mensagemErro = "Entrada inválida. Informe somente números.";
		}
	}
	
	// apenas verifico estrutura básica: xxxx@xxxx
	public void validarEmail(String email) {
		
		if(!email.matches(this.emailRegex)) {
			this.valido = false;
			this.mensagemErro = "Entre com um email válido.";
		}
	}
	
	public void validarSaldo(String saldo) {

		try {
			Double.parseDouble(saldo);
		} catch (Exception e) {
			this.valido = false;
			this.mensagemErro = "Saldo inválido. informe apenas valores.";
		}
		
	}
	
	// função para fazer o loop de entrada caso campo seja vazio
	public boolean campoVazio(String campo) {
		
		if (campo.isBlank()) {
			System.out.println("Campo não pode ser vazio, favor digitar novamente:");
			return true;
		} else {
			return false;
		}
	}
	
	// retorna estado de validação e mensagem de erro caso falso
	public boolean estaValido() {
		
		if (!this.valido) {
			System.out.println(this.mensagemErro);
		}
		
		return this.valido;
	}
	
}
