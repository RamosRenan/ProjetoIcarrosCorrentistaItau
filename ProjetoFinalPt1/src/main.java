import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ag, Conta, Nome, Email, Telefone, Saldo
		int opcao = 0,conta;
		double saldo;
		String ag,nome,email,telefone;
		Scanner s = new Scanner(System.in);
		ArrayList<String> clientes = new ArrayList<String>();
		
		while (opcao != 5) {
			
			System.out.println("************************************");
			System.out.println("Selecione a operacao:\n1- Cadastrar cliente \n2- Listar clientes \n3- Gravar em arquivo  \n4- Ler arquivo \n5- Sair\n");
			System.out.println("************************************");
			opcao = s.nextInt();	
			
			switch(opcao){
			//Cadastrar clientes	
				case 1:
					//adicionar validacao para cada caso ?
					try {
						//validar e formatar ?
						System.out.println("Entre com a agencia: ");
						ag = s.next();
						clientes.add(ag);
						//validar se nao tem caracteres, estipular limite ?
						System.out.println("Entre com a conta: ");
						conta = s.nextInt();
						clientes.add(Integer.toString(conta));
						//validar se nao tem numeros ?
						System.out.println("Entre com o nome: ");
						nome = s.next();
						clientes.add(nome);
						//validar se tem o @mail.com ?
						System.out.println("Entre com o email: ");
						email = s.next();
						clientes.add(email);
						//validar e formatar ? (99)99999-9999
						System.out.println("Entre com o telefone: ");
						telefone = s.next();
						clientes.add(telefone);
						//validar formato e formatar com R$ ?
						System.out.println("Entre com o saldo: ");
						saldo = s.nextDouble();
						clientes.add(Double.toString(saldo));
						
						System.out.println("Cliente cadastrado !");
						
					}catch (Exception e){
						System.out.println(e);
					}
			//Listar clientes	
				case 2:
			//Gravar arquivo
				case 3:
			//Ler arquivo
				case 4:
			//Sair
				case 5:
			}			
		}	
	}
}
