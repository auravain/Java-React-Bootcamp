package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialMediaLinksService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMediaLinks;

@CrossOrigin
@RestController
@RequestMapping("/api/socialMediaLinks")
public class SocialMediaLinksController {
	
	private SocialMediaLinksService socialMediaLinksService;

	@Autowired
	public SocialMediaLinksController(SocialMediaLinksService socialMediaLinksService) {
		super();
		this.socialMediaLinksService = socialMediaLinksService;
	}
	
	@PostMapping("/add")
	public Result add(SocialMediaLinks socialMediaLinks) {
		return this.socialMediaLinksService.add(socialMediaLinks);
	}
	
	@GetMapping("/getByCandidates_Id")
	public DataResult<List<SocialMediaLinks>> getByCandidates_Id(int candidatesId){
		return this.socialMediaLinksService.getByCandidates_Id(candidatesId);
	}

}