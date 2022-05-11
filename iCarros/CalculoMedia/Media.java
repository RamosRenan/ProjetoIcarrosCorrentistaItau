//package CalculoMedia;

import java.util.*;


/**
 * @author renan barbosa
 *
 * classe responsavel por scanear um nome de aluno e suas notas e realizar o calculo da média
 */
public class Media
{
	// defino que serão apenas quatro notas informadas pelo usuario
	private int qtd_scores = 4;

	private float notas;

	private String nome;
	
	public Media(){}

	public static void main(String[] args)
	{
		new Media().execScanner();
	}

	private void execScanner()
	{
		System.out.println("Iniciando pedido dos dados ! \n Insira seu nome: ");

		Scanner sc = new Scanner(System.in); 

		nome = sc.nextLine();
		//sc.close();

		int i = 0;
		while(qtd_scores > 0)
                {
			System.out.println("Insira nota_"+(++i));
		
			// se usuario inserir valor errado variaveis retornam para seus valores default e recomeça a inserção das notas
			try
			{
				notas +=sc.nextFloat();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Sua nota não é um valor válido reinsira os valores ...  "+e.getCause());
				sc = new Scanner(System.in);
				notas = 0.00f;
				qtd_scores = 5;
				i = 0;
			}
				
		        --qtd_scores;
                }

		System.out.println("Sua somatória é: "+notas+"\n Sua média é: "+(notas / 4));

	}

	//gets and sets se necessário ...
}

