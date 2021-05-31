package kodlamaio.hrms.core.adapter.abstracts;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface IUserCheckService {
	
	boolean checkIfRealPerson(Candidates candidates);
	
}
