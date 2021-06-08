package kodlamaio.hrms.core.adapter.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.adapter.abstracts.CheckEmailService;


@Component
@Primary
public class FakeMailCheckManager implements CheckEmailService{
	

	@Override
	public boolean mailCheck(String email) {
		return true;
	}
}
