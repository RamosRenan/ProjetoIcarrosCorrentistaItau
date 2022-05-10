
/*
 * Imprimi infomrmações de uma pessoa
 */
public class Impressao
{
	private String nome, endereco, estado, email;
	private int idade;

	public Impressao()
	{
	
	}

	public static void main(String[] args)
	{
		new Impressao().print();
	}

	private void print()
	{
		nome = "Givanildo Vidal Marques";
                endereco = "Rua teste";
                estado = "PB";
                idade = 150;
                email = "email.teste@gmail.com";

		System.out.printf("Nome: %s \n Endereço: %s \n estado: %s \n idade: %d \n email: %s ", nome, endereco, estado, idade, email);
	}
}
