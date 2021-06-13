package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SocialMediaLinks;

public interface SocialMediaLinksDao extends JpaRepository<SocialMediaLinks, Integer> {
	
	List<SocialMediaLinks> getByCandidates_Id(int candidatesId);

}