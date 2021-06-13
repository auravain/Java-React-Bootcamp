package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Skills;

public interface SkillsDao extends JpaRepository<Skills, Integer> {
	
	Skills getById(int id);
	List<Skills> getByCandidates_Id(int candidatesId);

}