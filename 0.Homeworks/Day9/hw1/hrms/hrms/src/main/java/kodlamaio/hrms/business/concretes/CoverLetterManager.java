package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverletterDao; 
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverletterDao) {
		super();
		this.coverletterDao = coverletterDao;
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverletterDao.save(coverLetter);
		return new SuccessResult("Cover letter is added");
	}

	@Override
	public DataResult<CoverLetter> getByCandidates_Id(int candidatesId) {
		return new SuccessDataResult<CoverLetter>(this.coverletterDao.getByCandidates_Id(candidatesId));
	}

}