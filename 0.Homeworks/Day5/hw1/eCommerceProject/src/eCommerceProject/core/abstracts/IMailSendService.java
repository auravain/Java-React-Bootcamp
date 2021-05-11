package eCommerceProject.core.abstracts;

public interface IMailSendService {
	
	int sendMail(String mail);
    int generateVerificationCode();
    
}
