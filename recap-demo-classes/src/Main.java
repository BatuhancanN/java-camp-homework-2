
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 30: ReCap Demo - Class
		
		FourOperations  fourOperations = new FourOperations();
		
		int value1 = fourOperations.Addition(10,2);
		int value2 = fourOperations.Subtraction(10,2);
		int value3 = fourOperations.Multiplication(10,2);
		int value4 = fourOperations.Division(10,2);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
