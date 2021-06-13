package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidatesService {
	
	public Result login(String email, String password);

	public Result register(Candidates candidates);

	public List<Candidates> getAll();
	public List<String> getAllEmails();
	public List<String> getAllNationalId();
}
