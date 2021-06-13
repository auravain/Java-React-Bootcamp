package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import kodlamaio.hrms.business.abstracts.CollegeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.College;

@CrossOrigin
@RestController
@RequestMapping("/api/colleges")
public class CollegeController {
	
	private CollegeService collegeService;

	@Autowired
	public CollegeController(CollegeService collegeService) {
		super();
		this.collegeService = collegeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody College college) {
		return this.collegeService.add(college);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<College>> getAll(){
		return this.collegeService.getAll();
	}
	
	@GetMapping("/getByCandidates_Id")
	public DataResult<List<College>> getByCandidates_Id(int candidatesId){
		return this.collegeService.getByCandidates_Id(candidatesId);
	}

}