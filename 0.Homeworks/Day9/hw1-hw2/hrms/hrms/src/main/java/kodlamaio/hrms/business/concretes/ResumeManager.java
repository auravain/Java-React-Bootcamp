package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
		
	}
	
	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Resume is added.");
	}

	@Override
	public DataResult<List<Resume>> getAll() {

		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(), "Data listed.");
	}

	@Override
	public DataResult<List<Resume>> getAllSortedGradutionYear() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "collegeResume.finishingDate");
		
		return new SuccessDataResult<List<Resume>>
		(this.resumeDao.findAll(sort), "Data listed.");
	}

	@Override
	public DataResult<List<Resume>> getAllSortedExperinceYear() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "jobExp.finishingDate");
		return new SuccessDataResult<List<Resume>>
		(this.resumeDao.findAll(sort), "Data listed");
	}

	@Override
	public DataResult<Resume> getById(int userId) {
		return new SuccessDataResult<Resume>
		(this.resumeDao.getById(userId), "Data listed");
		
	}
}
	