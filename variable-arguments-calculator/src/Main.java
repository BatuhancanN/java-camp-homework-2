import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 26: Variable Args...
		
		
		show(total(1,2,3,5,6,7,8,9,52345,235,2352,235235,23525));

	}
	
	
	public static int total(int... numbers)
	{
		int total = 0;
		for(int number:numbers)
		{
			total += number;
		}
		return total;
	}
	public static void show(int total)
	{
		System.out.println("\nToplam = " + total);
	}
}
