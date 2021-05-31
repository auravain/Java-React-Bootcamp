package kodlamaio.hrms.core.adapter.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface IEmailService {
	
	boolean verify(User user);
	
	void sendMail(String email,String message);
	
	
}