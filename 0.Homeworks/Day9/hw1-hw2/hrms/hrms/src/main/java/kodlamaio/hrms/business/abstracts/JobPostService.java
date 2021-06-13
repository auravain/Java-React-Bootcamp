package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPost;

public interface JobPostService {
	 DataResult<List<JobPost>> getAll();

	    DataResult<List<JobPost>> getAllStatusTrue();

	    DataResult<List<JobPost>> findAllByEmployer_IdAndStatusTrue(int employerId);


	    Result add(JobPost jobPost);

	    Result findById(int jobPostId,boolean status);

	    DataResult<List<JobPost>> findAllByStatusTrueSortedAsc();

	    DataResult<List<JobPost>> findAllByStatusTrueOrderByPostDateDesc();

}
