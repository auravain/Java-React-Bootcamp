package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPost;

@RestController
@RequestMapping("api/jobPosts/")
public class JobPostsController {

	private JobPostService jobPostService;

	@Autowired
	public JobPostsController(JobPostService jobPostService) {
		super();
		this.jobPostService = jobPostService;
	}

	@GetMapping("getAll")
	public DataResult<List<JobPost>> getAll() {
		return this.jobPostService.getAllStatusTrue();
	}

	@GetMapping("getByEmpId")
	public DataResult<List<JobPost>> getByEmpId(int employer_id) {
		return this.jobPostService.findAllByEmployer_IdAndStatusTrue(employer_id);
	}

	@PostMapping("add")
	public Result add(@RequestBody JobPost jobPost) {
		return this.jobPostService.add(jobPost);
	}

	@PutMapping("update")
	public Result update(@RequestParam int jobId, @RequestParam boolean status) {
		return this.jobPostService.findById(jobId, status);
	}

	@GetMapping("getDataBySortedAsc")
	public DataResult<List<JobPost>> getDataBySortedAsc() {
		return this.jobPostService.findAllByStatusTrueSortedAsc();
	}

	@GetMapping("getDataBySortedDesc")
	public DataResult<List<JobPost>> getDataBySortedDesc() {
		return this.jobPostService.findAllByStatusTrueOrderByPostDateDesc();
	}
}
