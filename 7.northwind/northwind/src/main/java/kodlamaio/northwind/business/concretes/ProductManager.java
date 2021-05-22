package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.business.abstracts.IProductService;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.IProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements IProductService {
	
	private IProductDao iProductDao;
	
	@Autowired
	public ProductManager(IProductDao iProductDao) {
		super();
		this.iProductDao = iProductDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.iProductDao.findAll(), "Data listelendi.");
				
				
	}

	@Override
	public Result add(Product product) {
		this.iProductDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

}
