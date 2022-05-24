import java.util.regex.*;


// regex que aceita casas decimais: ^\d{0,2}(\.\d{1,2})?$
// [-+]?\d*(?:.\d+)?
//
public class Regex
{
	public static void main(String args[])
	{
		boolean b = Pattern.matches("[0-9]", "1.5");
		
		if(b){
			System.out.println("Aceita decimal");
		}
		else{
			System.out.println("ñ Aceita decimal");
		}
	}
}
