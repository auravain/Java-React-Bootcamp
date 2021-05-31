package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPositions;

public interface IJobPositionsService {
	
	DataResult<List<JobPositions>> getAll();
	Result add(JobPositions jobPositions);
	
}
