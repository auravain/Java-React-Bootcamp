package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	List<Resume> findAllByCandidates_Id(int candidatesId); 
	Resume getById(int resumeId);
	
}