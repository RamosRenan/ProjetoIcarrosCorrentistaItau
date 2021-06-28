package crud;

import java.util.*;
import product.*;

public class CadastraProduto {
	
	private String 	name;
	private float	price;
	private int		qtd;
	private boolean status;
	
	@SuppressWarnings("resource")
	public void cadastrar() {
				
		Product product  =  new Product(); // cria um novo produto;
		
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Informe o nome do produto: \n");
			name = in.nextLine();
			
			System.out.println("Informe o status do produto: \n");
			System.out.println("\t 1 - Disponivel \n");
			System.out.println("\t 2 - Indisponivel \n");
			int stts = in.nextInt();
			boolean s = (stts == 1 ? true : false);
			status = s;
			
			System.out.println("Informe o preço do produto: \n");
			price = in.nextFloat();
			
			System.out.println("Informe a quantidade do produto: \n\n");
			qtd = in.nextInt();
			
			System.out.println("PRODUTO CADASTRADO COM SUCESSO !");
		}catch(InputMismatchException e) {
			System.out.println("Valor informado é inválido: "+e.getMessage()+" --> "+e.getCause());
			product = null;
			System.gc();
			cadastrar();
		}
		
		product.setName(name);
		product.setPrice(price);
		product.setQtd(qtd);
		product.setStatus(status);
		
		System.out.println("################################################# ");
		System.out.println("####################  PRODUTO ################### ");
		System.out.println("################################################# \n");
		System.out.println(product.toString());
		System.out.println("------------------------------------------------- \n\n");
		
		 		
	}
	
}
