package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialMediaLinksService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaLinksDao;
import kodlamaio.hrms.entities.concretes.SocialMediaLinks;

@Service
public class SocialMediaLinksManager implements SocialMediaLinksService{

	private SocialMediaLinksDao socialMediaLinksDao;
	@Autowired
	public SocialMediaLinksManager(SocialMediaLinksDao socialMediaLinksDao) {
		super();
		this.socialMediaLinksDao = socialMediaLinksDao;
	}

	@Override
	public Result add(SocialMediaLinks socialMediaLinks) {
		this.socialMediaLinksDao.save(socialMediaLinks);
		return new SuccessResult("Social media link is added.");
	}

	@Override
	public DataResult<List<SocialMediaLinks>> getByCandidates_Id(int candidatesId) {
		return new SuccessDataResult<List<SocialMediaLinks>>(this.socialMediaLinksDao.getByCandidates_Id(candidatesId));
	}

	
	
}