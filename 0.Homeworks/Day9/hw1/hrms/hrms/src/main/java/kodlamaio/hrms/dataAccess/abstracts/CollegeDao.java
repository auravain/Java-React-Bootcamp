package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.College;

public interface CollegeDao extends JpaRepository<College, Integer> {
    
	College getById(int id);
    List<College> getByCandidates_Id(int candidatesId);
   
}