import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ag, Conta, Nome, Email, Telefone, Saldo
		// int opcao = 0,conta;
		// double saldo;
		// troquei os tipos para evitar estouro de exception
		String ag,nome,email,telefone,conta,saldo,opcao = "";
		Scanner s = new Scanner(System.in);
		ArrayList<String> clientes = new ArrayList<String>();
		
		while (!opcao.equals("5")) {
			
			Validador validador = new Validador();
			
			System.out.println("************************************");
			System.out.println("Selecione a operacao:\n1- Cadastrar cliente \n2- Listar clientes \n3- Gravar em arquivo  \n4- Ler arquivo \n5- Sair\n");
			System.out.println("************************************");
			opcao = s.next();

			validador.validarMenu(opcao);
			// ao verificar, se entrada conter erro, exibe erro e força o loop
			if (!validador.estaValido()) {
				continue;
			}
			
			switch(opcao){
			//Cadastrar clientes	
				case "1":
					//adicionar validacao para cada caso ?
					try {
						//validar e formatar ?
						System.out.println("Entre com a agencia: ");
						ag = s.next();
						validador.validarApenasNumeros(ag);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(ag);
						//validar se nao tem caracteres, estipular limite ?
						System.out.println("Entre com a conta: ");
						conta = s.next();
						validador.validarApenasNumeros(conta);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(conta);
						//validar se nao tem numeros ?
						System.out.println("Entre com o nome: ");
						nome = s.next();
						validador.validarNome(nome);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(nome);
						//validar se tem o @mail.com ?
						System.out.println("Entre com o email: ");
						email = s.next();
						validador.validarEmail(email);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(email);
						//validar e formatar ? (99)99999-9999
						System.out.println("Entre com o telefone: ");
						telefone = s.next();
						validador.validarApenasNumeros(telefone);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(telefone);
						//validar formato e formatar com R$ ?
						System.out.println("Entre com o saldo: ");
						saldo = s.next();
						validador.validarSaldo(saldo);
						if (!validador.estaValido()) {
							continue;
						}
						clientes.add(saldo);
						
						System.out.println("Cliente cadastrado !");
						
					}catch (Exception e){
						System.out.println(e);
					}
					break;
			//Listar clientes	
				case "2":
					break;
			//Gravar arquivo
				case "3":
					break;
			//Ler arquivo
				case "4":
					break;
			//Sair
				case "5":
					s.close(); // evitando memory leak
					System.out.println("EXIT");
					break;
			}			
		}	
	}
}
