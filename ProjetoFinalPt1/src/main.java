import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//Ag, Conta, Nome, Email, Telefone, Saldo
		// int opcao = 0,conta;
		// double saldo;
		// troquei os tipos para evitar estouro de exception
		String ag,nome,email,telefone,conta,saldo,msg,opcao = "";
		Scanner s = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
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
						msg = "Entre com a agencia: ";
						ag = s.next();
						validador.empty(ag, msg);
						validador.validarApenasNumeros(ag);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setAg(ag);
						//validar se nao tem caracteres, estipular limite ?
						System.out.println("Entre com a conta: ");
						msg = "Entre com a conta: ";
						conta = s.next();
						validador.empty(conta, msg);
						validador.validarApenasNumeros(conta);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setConta(conta);
						//validar se nao tem numeros ?
						System.out.println("Entre com o nome: ");
						msg = "Entre com o nome: "; 
						nome = s.next();
						validador.empty(conta, msg);
						validador.validarNome(nome);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setNome(nome);
						//validar se tem o @mail.com ?
						System.out.println("Entre com o email: ");
						msg = "Entre com o email: ";
						email = s.next();
						validador.empty(email, msg);
						validador.validarEmail(email);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setEmail(email);
						//validar e formatar ? (99)99999-9999
						System.out.println("Entre com o telefone: ");
						msg = "Entre com o telefone: ";
						telefone = s.next();
						validador.empty(telefone, msg);
						validador.validarApenasNumeros(telefone);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setTelefone(telefone);
						//validar formato e formatar com R$ ?
						System.out.println("Entre com o saldo: ");
						msg = "Entre com o saldo: ";
						saldo = s.next();
						validador.empty(saldo, msg);
						validador.validarSaldo(saldo);
						if (!validador.estaValido()) {
							continue;
						}
						cliente.setSaldo(saldo);
						
						clientes.add(cliente);
						
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
					try {
						//estabelecer path
						FileWriter file = new FileWriter("registros.txt");
						
						//variavel para gravacao em arquivo
						PrintWriter gravarArquivo = new PrintWriter(file);
						
						// Gravando informacoes
						for (int i=0; i<clientes.size(); i++) {
							gravarArquivo.printf(clientes.get(i)+"\n");
						}
						
						//fecha arquivo
						file.close();
						System.out.println("Informacao gravada");
						break;
					}catch(Exception e) {
						System.out.println("Error : " + e);
					}
			
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
