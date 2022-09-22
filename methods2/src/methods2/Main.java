package methods2;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 25: Metodlar 2
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk sayıyı girin: ");
		int number1 = input.nextInt();
		
		System.out.print("İkinci sayıyı girin: ");
		int number2 = input.nextInt();
		
		show(total(number1,number2));
		
	}
	
	public static int total(int n1, int n2)
	{
		int total = n1 + n2;
		return total;
	}
	
	public static void show(int total)
	{
		System.out.println("\nToplam: " + total);
	}
}
