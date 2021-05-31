package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPositions;

public interface IJobPositionsDao extends JpaRepository<JobPositions, Integer> {

}
