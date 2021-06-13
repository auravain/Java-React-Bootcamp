package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMediaLinks;

public interface SocialMediaLinksService {
	
	Result add (SocialMediaLinks socialMediaLinks);
	DataResult<List<SocialMediaLinks>> getByCandidates_Id(int candidatesId);

}