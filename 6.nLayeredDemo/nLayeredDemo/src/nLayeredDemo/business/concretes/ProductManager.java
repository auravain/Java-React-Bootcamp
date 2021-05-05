package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao ProductDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.ProductDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		//Ýþ kodlarý yazýlýr.
		
		if(product.getCategory()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor." + product.getName());
			return;
		}
		
		this.ProductDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
