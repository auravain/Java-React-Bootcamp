package eCommerceProject.business.concretes;

import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.IUserService;
import eCommerceProject.dataAccess.abstracts.IUserDao;
import eCommerceProject.entities.concretes.User;


public class UserManager implements IUserService{
	
	String regex ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern=Pattern.compile(regex);
	public UserManager(IUserDao iUserDao) {}

	@Override
	public boolean mailCheck(User user) {
	if(user.getEmail().matches(regex) ) {
		
		return true;
	}

	else {
		System.out.println ("You have not entered a valid e-mail address.");}
	return false;
	}

	@Override
	public boolean nameCheck(User user) {
		if(user.getFirstName().length()>=2) {
			return true;
		}
		
		else {
			System.out.println ("Please define a name with at least 2 characters.");
		}
		return false;
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()>=5) {
			return true;
		
	}
		else {
			System.out.println ("\r\n" + "Please define a password with at least 5 characters.");
		}
		return false;
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
