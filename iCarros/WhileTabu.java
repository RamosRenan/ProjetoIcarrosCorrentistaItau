
import java.util.*;

public class WhileTabu
{
	public static void main(String[] args)
	{
		System.out.println("Informe um número: ");
		
		Scanner sc = new Scanner(System.in);

		int num  = sc.nextInt();

		if(!(num < 1 || num > 9))
		{
			for(int i = num; i < 10; i++)
			{
				for(int y = 1; y < 10; y++)
				{
					System.out.println(i+"x"+y+"="+(i * y));
				}
			}
		}else
		{
			System.out.println("Numero invalido");
		}
	}
}

