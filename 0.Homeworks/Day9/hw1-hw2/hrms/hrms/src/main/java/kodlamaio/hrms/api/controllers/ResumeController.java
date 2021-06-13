package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;


@RestController
@RequestMapping(value= "api/resume")
public class ResumeController {
	
	private ResumeService resumeService;
    
	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getAllSortedGradutionYear")
	public DataResult<List<Resume>> getAllSortedGradutionYear() {
		
		return this.resumeService.getAllSortedGradutionYear();
	}
	
	@GetMapping("/getAllSortedExperinceYear")
	public DataResult<List<Resume>> getAllSortedExperinceYear() {
		
		return this.resumeService.getAllSortedExperinceYear();
	}
	
	@PostMapping("/getByResumeId")
	public DataResult<Resume> getByCvId(int resumeId) {
		
		return this.resumeService.getById(resumeId);
		
	}
	
	@PostMapping("/ResumeAdd")
	public Result add(@RequestBody Resume resume) {
		
		return this.resumeService.add(resume);
		
	}
	
}