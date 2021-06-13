package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "colleges")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="college_name")
	private String collegeName;
	
	@Column(name="departmant")
	private String departmant;
	
	@Column(name="starting_date")
	private LocalDate startingDate;
	
	@Column(name="graduated_date")
	private LocalDate graduatedDate;
	
	@ManyToOne
    @JoinColumn(name = "candidates_id")
    private Candidates candidates;

}