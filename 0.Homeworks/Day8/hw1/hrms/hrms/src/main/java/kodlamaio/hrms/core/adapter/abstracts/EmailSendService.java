package kodlamaio.hrms.core.adapter.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailSendService {
	public void emailSend(String email);
}
