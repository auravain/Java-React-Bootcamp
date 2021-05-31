package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IJobPositionsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IJobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements IJobPositionsService{
	
	private IJobPositionsDao iJobPositionsDao;
	
	
	@Autowired
	public JobPositionsManager(IJobPositionsDao iJobPositionsDao) {
		super();
		this.iJobPositionsDao = iJobPositionsDao;
	}

	@Override
	public DataResult<List<JobPositions>> getAll() {
		return new SuccessDataResult<List<JobPositions>>(this.iJobPositionsDao.findAll(), "Data listelendi.");
	}


	@Override
	public Result add(JobPositions jobPositions) {
		this.iJobPositionsDao.save(jobPositions);
		return new SuccessResult("Ürün eklendi.");
			
	}
}
