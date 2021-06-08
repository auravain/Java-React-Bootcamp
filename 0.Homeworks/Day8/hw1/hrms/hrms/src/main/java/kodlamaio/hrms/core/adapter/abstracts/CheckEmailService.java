package kodlamaio.hrms.core.adapter.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface CheckEmailService {
	public boolean mailCheck(String email);
}
