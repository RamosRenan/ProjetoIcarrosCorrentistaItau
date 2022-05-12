//package CalculoMedia;

import java.util.*;


/**
 * @author renan barbosa
 *
 * classe responsavel por scanear um nome de aluno e suas notas e realizar o calculo da média
 */
public class Media
{
	// 	defino que serão apenas quatro notas informadas pelo usuario
		private int qtd_scores = 4;

	private float notas, auxNotas;

	private String nome;

	private String resultadoCadaAluno[][] = new String[3][6];
	
	public Media(){}
	
	// nova instancia da classe media e aciona metodo para executar app
	public static void main(String[] args)
	{
		new Media().execScanner();
	}


	/*
	 *  realiza iteração no array bidimensional para preenche os dados de cada aluno. A estrutura é 
	 *  cada row representa 1 aluno com duas notas e medias
	 *
	 *  [0][0] aluno 1
	 *  [1][0] aluno 2
	 *  .
	 *  .
	 *  .
	*/
	private void execScanner()
	{

		Scanner sc = new Scanner(System.in); 

		int i = 1, y = 0;

		int qtd_alunos = 0;
		while(qtd_alunos < 3)
                {
			System.out.println("Iniciando pedido dos dados ! \n Insira seu nome: ");
			
			nome = sc.nextLine();

			resultadoCadaAluno[qtd_alunos][0] = nome;

			for(y = 1; y < 5; y++)
			{
				System.out.println("Insira nota_"+(i++));

				// se usuario inserir valor errado variaveis retornam para seus valores default e recomeça a inserção das notas
				try
				{
					auxNotas = sc.nextFloat();
					notas += auxNotas;

					resultadoCadaAluno[qtd_alunos][y] = Float.toString(auxNotas);


				}
				catch(InputMismatchException e)
				{
					System.out.println("Sua nota não é um valor válido reinsira os valores ...  "+e.getCause());
					notas = 0.00f;
					qtd_scores = 5;
					i = 0;
					qtd_alunos = 0;
				}
				
			}
			resultadoCadaAluno[qtd_alunos][y] = Float.toString(notas/4); 
			sc = new Scanner(System.in);
			qtd_alunos++;
			i = 1;
			notas = 0.00f;
                }
		
		/**
		 * Apresenta resultado dos alunos
		 */
		System.out.println("\n nome \t nota1 \t nota2 \t nota3 \t nota4 \t media \t Resultado");
		for(int w = 0; w < 1; w++)
		{
			int z =0;
			for(z = 0; z < 5; z++)
			{
				System.out.print("  "+resultadoCadaAluno[w][z]+"\t");

			}

			System.out.printf("%.2f",Float.valueOf(resultadoCadaAluno[w][z-1]));
			System.out.printf(" \t ");

			if(Float.valueOf(resultadoCadaAluno[w][z-1]) > 5f)
                        {
                                    System.out.print("\t APROV.");
                        }
                        else if(Float.valueOf(resultadoCadaAluno[w][z-1]) == 5f)
                        {
                       	         System.out.print("\t RECUP.");
                        }
                        else
                        {
                                System.out.print("\t REPROV.");
                        }
			System.out.print("\n");
		}

	}

	//gets and sets se necessário ...
}

