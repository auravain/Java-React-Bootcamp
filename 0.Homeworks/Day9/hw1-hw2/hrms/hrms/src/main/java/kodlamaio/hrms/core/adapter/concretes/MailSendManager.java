package kodlamaio.hrms.core.adapter.concretes;

import org.springframework.stereotype.Service;

@Service
public class MailSendManager {
	public void verificationSend(String email) {
		System.out.println(" verification sent to your email: " + email);
	}
}
