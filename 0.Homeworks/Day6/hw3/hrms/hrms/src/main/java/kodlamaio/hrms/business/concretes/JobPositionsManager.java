package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IJobPositionsService;
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
	public List<JobPositions> getAll() {
		return iJobPositionsDao.findAll();
	}
}
