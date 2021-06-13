package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Skills;


public interface SkillsService {
	
	Result add(Skills skills);
	DataResult<List<Skills>> getAll();
	DataResult<Skills> getById(int id);
	DataResult<List<Skills>> getByCandidates_Id(int candidatesId);
	
}