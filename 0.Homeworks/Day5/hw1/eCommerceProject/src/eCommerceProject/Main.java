package eCommerceProject;

import eCommerceProject.business.concretes.AuthenticationManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.concretes.GoogleManagerAdapter;
import eCommerceProject.core.concretes.MailSendManager;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		

		AuthenticationManager authenticationManager = new AuthenticationManager(new UserManager(new HibernateUserDao()), new MailSendManager(),
				new GoogleManagerAdapter(new GoogleManagerAdapter(null)));
		
		User user = new User(1, "İlknur", "Sucaklı", "ilknurr.94@hotmail.com", "123456");
		
		authenticationManager.signInWithGoogle(user);
		authenticationManager.signUp(user);
		authenticationManager.signIn(user);
		
		
		
		
	}

}
