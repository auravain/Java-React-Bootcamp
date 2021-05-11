package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface IUserService {
	
	public boolean mailCheck (User user);
	public boolean nameCheck (User user);
	public boolean passwordCheck(User user);
	public User add(User user);
	
}
