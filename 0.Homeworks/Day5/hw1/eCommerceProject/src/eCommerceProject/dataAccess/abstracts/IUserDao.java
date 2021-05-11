package eCommerceProject.dataAccess.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface IUserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getEmail(String email);
	List<User> getAll();
}
