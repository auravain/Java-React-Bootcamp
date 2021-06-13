package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.College;
import kodlamaio.hrms.entities.concretes.CoverLetter;
import kodlamaio.hrms.entities.concretes.Experience;
import kodlamaio.hrms.entities.concretes.Image;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.Skills;
import kodlamaio.hrms.entities.concretes.SocialMediaLinks;
import kodlamaio.hrms.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
	
	private User user;
	private Image image;
	private CoverLetter coverLetter;
	private List<College> colleges;
	private List<Skills> techSkills;
	private List<Language> languages;
	private List<Experience> experiences;
	private List<SocialMediaLinks> socialMediaLinks;

}