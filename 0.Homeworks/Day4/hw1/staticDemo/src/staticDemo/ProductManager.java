package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	
		
	}
}

//NOT: Bir metodu static yapt���m�zda, class ismiyle direkt �a��r�l�r.