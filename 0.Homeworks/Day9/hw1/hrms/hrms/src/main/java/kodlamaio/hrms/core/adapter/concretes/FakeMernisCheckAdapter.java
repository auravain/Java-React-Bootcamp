package kodlamaio.hrms.core.adapter.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.adapter.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.Candidates;

@Component
@Primary
public class FakeMernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		return true;
	}

}
