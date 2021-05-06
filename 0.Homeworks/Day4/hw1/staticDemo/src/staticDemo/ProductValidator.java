package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapýcý blok çalýþtý.");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	//inner class
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
