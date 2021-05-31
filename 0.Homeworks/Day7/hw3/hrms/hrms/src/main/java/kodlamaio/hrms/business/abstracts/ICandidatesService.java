package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface ICandidatesService {
	
	DataResult<List<Candidates>> getAll();
	
}
