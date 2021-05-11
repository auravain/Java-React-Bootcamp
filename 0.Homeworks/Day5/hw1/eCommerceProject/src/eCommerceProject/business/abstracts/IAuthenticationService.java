package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface IAuthenticationService {
	
	void signUp(User user);

	void signIn(User user);

	void signInWithGoogle(User user);
	
}
