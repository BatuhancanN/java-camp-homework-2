
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 31: Attributes
		// Ders 32: Encapsulation 
		// Ders 33: Getter ve Setter
		// Ders 34: Constructor
		
		// yapıcı blokta veriyi parantez içine yazıldığında oraya gönderebilirsin.
		Product product = new Product(1, "laptop", "asus laptop", 3000, 2, "siyah");
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setRenk("siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println("\n\t" + product.getKod());
	}

}
