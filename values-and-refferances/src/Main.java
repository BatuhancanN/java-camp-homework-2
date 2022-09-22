
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 29: değerler ve referanslar
		
		// Referans
		Test number1 = new Test();
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);	//sayılar2 de sayılar1 i referans alır. int değerler gibi değildiri referanstır array
		
		
		// Değer
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		

	}

}
