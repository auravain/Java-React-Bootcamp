package kodlamaio.hrms.core.adapter.concretes;

import kodlamaio.hrms.core.adapter.abstracts.IEmailService;
import kodlamaio.hrms.entities.concretes.User;

public class EmailServiceAdapter implements IEmailService{

	

	@Override
	public void sendMail(String email, String message) {
		System.out.println(email + "adresine" + message + "gönderildi.");
		
	}

	@Override
	public boolean verify(User user) {
		return true;
	}
	
}
