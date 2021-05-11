package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.dataAccess.abstracts.IUserDao;
import eCommerceProject.entities.concretes.User;

public class HibernateUserDao implements IUserDao{
	
	List <User> users = new ArrayList<User>();
	User user1=new User(1,"Ýlknur","Sucaklý","ilknurr.94@hotmail.com","123456");
	
	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("User added to database.");
		
	}

	@Override
	public void delete(User user) {
		
		user = users.remove(user.getId());
		System.out.println("User information has been deleted from the database.");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("User information has been updated in the database.");
		
	}

	@Override
	public User getEmail(String email) {
		
		User user=users.stream().filter(u->u.getEmail()==email).findFirst().orElse(null);
		
		return user;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
