package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Language;

@CrossOrigin
@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public Result add(Language language) {
		return this.languageService.add(language);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<List<Language>> getByCandidates_Id(int candidatesId){
		return this.languageService.getByCandidates_Id(candidatesId);
	}

}