package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPost;

public interface JobPostDao extends JpaRepository<JobPost, Integer>{
	
	List<JobPost> findAllByStatusTrue();
    List<JobPost> findAllByEmployer_IdAndStatusTrue(int employerId);
    List<JobPost> findAllByStatusTrueOrderByPostDateAsc();
    List<JobPost> findAllByStatusTrueOrderByPostDateDesc();
    
}
