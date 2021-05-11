package eCommerceProject.core.concretes;

import eCommerceProject.core.abstracts.ISignUpService;
import eCommerceProject.entities.concretes.User;

public class GoogleManagerAdapter implements ISignUpService{

	private GoogleManagerAdapter googleService;
	
	public GoogleManagerAdapter(GoogleManagerAdapter googleService) {
		this.googleService = googleService;
	}
	
	@Override
	public void signUp(User user) {
		googleService.signUp(user.getEmail(), user.getPassword());
		
	}

	private void signUp(String email, String password) {
		// TODO Auto-generated method stub
		
	}

}
