
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 37: inheritance demo
		
		KrediUI krediUI = new KrediUI();
		// Parantez içine tarım da yazılabilir, öğretmen de. ilerde başka seçenekler eklendğinde onları da yazabilir
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
