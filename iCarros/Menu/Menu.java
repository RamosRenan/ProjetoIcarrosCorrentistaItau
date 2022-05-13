/**
 * Description task
 *
 *Criar um menu com 5 opções

===============================
	Sistema de Cálculo
===============================
	1 - adição
	valor1 + valor 2 mostrar resultado
	2 - subtração
	valor1 -valor2 = resultado
	3 - divisão
	4 - multiplicação
	5 - sair

	default
	Opção Inválida

	do while
	Opções serão SWCase

	tratar a entrada de dados com If
 */

import java.util.*;

public class Menu
{
	public static void main(String[] args)
	{
		/**
		 * Menu
		 * 1 adicao
		 * 2 subtrac
		 * 3 div
		 * 4 multiplic
		 * 5 sair 
		 */

		Scanner sc = new Scanner(System.in);
		int optionMenu = 0;
		do
		{
			System.out.println("Selecione a opção: \n \t 1 adição \n \t 2 subtração \n \t 3 divisao \n \t 4 multiplicacao \n \t 5 sair");

			boolean optionMenuIsValid = false;

			try{
				optionMenu = sc.nextInt();
				optionMenuIsValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Opção informada não é válida: "+e.getCause());

				optionMenuIsValid = false;
			}

			if(optionMenuIsValid)
			{
				switch(optionMenu)
				{
					case 1:
					try
					{
					System.out.println("Informe o primeiro número: ");
					double algarismo1 = sc.nextDouble();

					System.out.println("Informe o segundo número: ");	
					double algarismo2 = sc.nextDouble();

					System.out.println("Resultado: "+(algarismo1+algarismo2));
					System.out.flush();
					}
					catch(InputMismatchException e)
					{
						System.out.println("Número informado inválido: "+e.getCause());
					}
					break;

					case 2:
                                        try
                                        {
                                        System.out.println("Informe o primeiro número: ");
                                        double algarismo1 = sc.nextDouble();

                                        System.out.println("Informe o segundo número: ");
                                        double algarismo2 = sc.nextDouble();

                                        System.out.println("Resultado: "+(algarismo1-algarismo2));
                                        System.out.flush();
                                        }
                                        catch(InputMismatchException e)
                                        {
                                                System.out.println("Número informado inválido: "+e.getCause());
                                        }
                                        break;

					case 3:
                                        try
                                        {
                                        System.out.println("Informe o primeiro número: ");
                                        double algarismo1 = sc.nextDouble();

                                        System.out.println("Informe o segundo número: ");
                                        double algarismo2 = sc.nextDouble();

                                        System.out.println("Resultado: "+(algarismo1/algarismo2));
                                        System.out.flush();
                                        }
                                        catch(InputMismatchException e)
                                        {
                                                System.out.println("Número informado inválido: "+e.getCause());
                                        }
                                        break;

					case 4:
                                        try
                                        {
                                        System.out.println("Informe o primeiro número: ");
                                        double algarismo1 = sc.nextDouble();

                                        System.out.println("Informe o segundo número: ");
                                        double algarismo2 = sc.nextDouble();

                                        System.out.println("Resultado: "+(algarismo1*algarismo2));
                                        System.out.flush();
                                        }
                                        catch(InputMismatchException e)
                                        {
                                                System.out.println("Número informado inválido: "+e.getCause());
                                        }
                                        break;

					case 5:
                                        System.exit(0);
					break;

					default:
                                        System.out.println("Opção não é válida");
                                        break;

				}//switch
			}//if
			
			sc = new Scanner(System.in);
		}
		while(optionMenu != 5);
	}
}
