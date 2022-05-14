/*
	HashMapDados
	classe:ProcessaDadosHashMap

	Criar um super menu
	1º) Inserir Registro - While 5
	2º) Lista todos os Registros
	3º) Lista somente o registro a ser consultado  Pesquisa = Marca
	4º) Exclua o registro com base no ítem consultado Exclusão por Produto
	5º) Sair

Produto,Valor,Marca
*/


import java.util.*;

public class ProcessaDadosHashMap
{
	public static void main(String[] args)
	{
		int contadorWhile = 0; 

		String produto, marca, valor = "";
		
		HashMap<String, String> hashMapStore = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		while(contadorWhile < 5)
		{
			System.out.println("Informe a opção: \n \t 1º) Inserir Registro \n \t 2º) Lista todos os Registros \n \t 3º) Lista somente o registro a ser consultado \n \t 4º) Exclua o registro com base no ítem consultado Exclusão por Produto \n \t 5º) Sair \n");

			int option = sc.nextInt();
			sc = new Scanner(System.in);
			switch(option)
			{
				case 1:
					System.out.println("Informe o produto: ");
					produto = sc.nextLine();

					System.out.println("Informe a marca: ");
					marca = sc.nextLine();

					System.out.println("Informe o valor");
					valor = sc.nextLine();
					
					hashMapStore.put(produto, marca+" "+valor);
					
					break;
				case 2:
					int count = 0;
					Collection<String> setCollection = hashMapStore.values();
					Iterator<String> iteraCollection = setCollection.iterator();
					
					Set<String> keySet = hashMapStore.keySet();

					Iterator<String> iteraKeySet = keySet.iterator();

					while(iteraCollection.hasNext() && iteraKeySet.hasNext())
					{
						System.out.println(iteraKeySet.next()+" "+iteraCollection.next());
						
						if((count%2) != 1)
						{
							System.out.println("----------------------------------------------------");
						}
					}
					break;

				case 3:
					System.out.println("Informe o produto a ser consultado: ");
					
					sc = new Scanner(System.in);
					
					String product = sc.nextLine();

					Collection<String> setCollectionFind = hashMapStore.values();

                                        Iterator<String> iteraCollectionFind = setCollectionFind.iterator();
					
					Set<String> keySetFind = hashMapStore.keySet();

                                        Iterator<String> iteraKeySetFind = keySetFind.iterator();

					while(iteraCollectionFind.hasNext())
                                        {
						if(iteraKeySetFind.next().equals(product))
						{
                                                        System.out.println("\n \t Listando produto: \n"+product+" "+iteraCollectionFind.next()+"\n");
						}else{
							iteraCollectionFind.next();
						}
                                        }
					break;
				default:
					System.exit(0);


			}
		}
	}
}
