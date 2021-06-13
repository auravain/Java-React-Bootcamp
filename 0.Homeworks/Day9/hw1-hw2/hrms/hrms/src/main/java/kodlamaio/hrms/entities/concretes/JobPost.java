package kodlamaio.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "job_posts")
public class JobPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "job_description")
	private String jobDescription;

	@Column(name = "min_salary")
	private String minSalary;

	@Column(name = "max_salary")
	private String maxSalary;

	@Column(name = "number_of_job_position")
	private String jobOfNumberPosition;

	@Column(name = "end_of_job_date")
	private Date endOfJobDate;

	@Column(name = "status")
	private boolean status;

	@Column(name = "post_date")
	@Temporal(TemporalType.DATE)
	private Date postDate;

	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@ManyToOne()
	@JoinColumn(name = "position_id")
	private Position position;

	public void setStatus(boolean status2) {
		// TODO Auto-generated method stub
		
	}

}
