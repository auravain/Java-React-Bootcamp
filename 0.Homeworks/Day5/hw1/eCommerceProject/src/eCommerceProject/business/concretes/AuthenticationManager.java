package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.IAuthenticationService;
import eCommerceProject.business.abstracts.IUserService;
import eCommerceProject.core.abstracts.IMailSendService;
import eCommerceProject.core.abstracts.ISignUpService;
import eCommerceProject.entities.concretes.User;

public class AuthenticationManager implements IAuthenticationService {
	
	private IUserService iUserService;
	private IMailSendService iMailSendService;
	private ISignUpService iSignUpService;

	public AuthenticationManager(IUserService iUserService, IMailSendService iMailSendService) {
		this.iUserService = iUserService;
		this.iMailSendService = iMailSendService;
	}

	public AuthenticationManager(IUserService iUserService, IMailSendService iMailSendService, ISignUpService iSignUpService) {
		this.iUserService = iUserService;
		this.iMailSendService = iMailSendService;
		this.iSignUpService = iSignUpService;
	}

	@Override
	public void signUp(User user) {
		User signUpUser= iUserService.add(user);
		if (signUpUser != null){
			System.out.println("Successfully sign up with " + user.getFirstName());
		}
	}

	@Override
	public void signIn(User user) {
		User signInUser = iUserService.add(user);
		if (signInUser != null){
			iMailSendService.sendMail(user.getEmail());
		}
	}

	@Override
	public void signInWithGoogle(User user) {

		User signInUser = iUserService.add(user);
		if (signInUser != null){
			iMailSendService.sendMail(user.getEmail());
			iSignUpService.signUp(user);
		}
	}
	
}
