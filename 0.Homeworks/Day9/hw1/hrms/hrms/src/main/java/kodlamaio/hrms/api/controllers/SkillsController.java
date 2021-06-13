package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SkillsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Skills;

@CrossOrigin
@RestController
@RequestMapping("api/skills")
public class SkillsController {
	private SkillsService skillsService;

	@Autowired
	public SkillsController(SkillsService skillsService) {
		super();
		this.skillsService = skillsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skills skills) {
		return this.skillsService.add(skills);
	}
	
	@GetMapping("/getByCandidates_Id")
	public DataResult<List<Skills>> getByCandidates_Id(int candidatesId) {
		return this.skillsService.getByCandidates_Id(candidatesId);
	}

}