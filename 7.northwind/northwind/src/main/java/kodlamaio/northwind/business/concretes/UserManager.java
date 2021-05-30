package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.IUserService;
import kodlamaio.northwind.core.dataAccess.IUserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements IUserService{
	
	private IUserDao iUserDao;
	
	@Autowired
	public UserManager(IUserDao iUserDao) {
		super();
		this.iUserDao = iUserDao;
	}

	@Override
	public Result add(User user) {
		this.iUserDao.save(user);
		return new SuccessResult("Kullanıcı eklendi.");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.iUserDao.findByEmail(email), "Kullanıcı bulundu.");
	}

}
