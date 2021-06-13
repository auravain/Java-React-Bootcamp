package kodlamaio.hrms.core.adapter.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapter.abstracts.EmailSendService;



@Service
public class EmailSendManagerAdapter implements EmailSendService {

	private MailSendManager mailSendManager;


	public EmailSendManagerAdapter(MailSendManager mailSendManager) {
		super();
		this.mailSendManager = mailSendManager;
	}


	@Override
	public void emailSend(String email) {
		mailSendManager.verificationSend(email);

	}

}
