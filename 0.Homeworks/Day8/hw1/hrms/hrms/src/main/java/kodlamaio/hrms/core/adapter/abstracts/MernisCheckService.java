package kodlamaio.hrms.core.adapter.abstracts;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Candidates;


@Service
public interface MernisCheckService {
	public boolean checkIfRealPerson(Candidates candidates);
}