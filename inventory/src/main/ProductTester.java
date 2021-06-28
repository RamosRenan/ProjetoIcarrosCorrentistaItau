package main;
 
import java.io.*;
import java.util.*;
import crud.*;

public class ProductTester {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {

		/* ***************************
		 * Part 2 do projeto		 *
		 * ***************************/
		
		Scanner in = new Scanner(System.in); 
		
		int op = 00;
		
		System.out.print("MENU\n");
		System.out.print("\t Opções: \n");
		System.out.print("\t 1 Cadastrar produto.\n");
		System.out.print("\t 2 Sair.  \n");
		
				
		while(op != 2) {			
			try {
				op = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				// TODO: handle exception
 				op = 00;
 				System.out.print("\t VOCÊ DIGITOU UMA OPÇÃO INVÁLIDA ={ \n");
 				Thread.sleep(2000L);
   				ProductTester.main(null);
			}			
		}				
		
		switch (op) {
		case 1:
			CadastraProduto cadastrar  = new CadastraProduto();
			cadastrar.cadastrar();
			ProductTester.main(null);
			break;

		case 2:
			
			break;

		default:
			break;
		}
		
		/* ***********************************************
		 * 	Part 1 do projeto							 *
		 *****************
		 *********************************		
		
		// cria novo object de produto sem parametros no construtor
		Product productNP1 = new Product(); // productNP means productNoParameters1
		
		productNP1.setId_product(417);
		productNP1.setName("betamax");
		productNP1.setQtd(5);
		productNP1.setPrice(150.00f);
		
		// cria novo object de produto sem parametros no construtor
		Product productNP2 = new Product(); // productNP means productNoParameters1
		
		productNP2.setId_product(123);
		productNP2.setName("nintendo");
		productNP2.setQtd(8);
		productNP2.setPrice(250.00f);
		
		// cria novo object de produto com parameters no construtor
		Product productP1 = new Product("walkman", 350.00f, 9, 465); // productNP means productParameters1
		Product productP2 = new Product("vitrola", 450.00f, 7, 789); // productNP means productParameters2
		Product productP3 = new Product("kichute", 550.00f, 1, 987); // productNP means productParameters3
		Product productP4 = new Product("playstation", 650.00f, 50, 025); // productNP means productParameters4
		
		// mostra dados do objeto productNP1
		System.out.println(productNP1.toString()); // print para user product 1	
		
		// laço para print char '-' apenas para separar linha 
		System.out.print("\n");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.print("\n\n");
		
		// mostra dados do objeto productNP2
		System.out.println(productNP2.toString()); // print para user product 2	
		
		System.out.println("\n Abaixo todos os produtos que utilizam constructor com parâmetros\n"); // print para user product 2	

		System.out.println(productP1.toString()+"\n"); // print para user product 1	
		System.out.println(productP2.toString()+"\n"); // print para user product 2	
		System.out.println(productP3.toString()+"\n"); // print para user product 3	
		System.out.println(productP4.toString()+"\n"); // print para user product 4	
				
		//
		*/

				
	}// final methos main
}// final class ProductTester
