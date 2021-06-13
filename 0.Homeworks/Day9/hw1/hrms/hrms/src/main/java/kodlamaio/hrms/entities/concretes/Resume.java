package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="resume")
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne()
	@JoinColumn(name = "candidates_id")
	private Candidates candidates;  
	
	@Column(name= "social_media_links")
	private String socialMediaLinks;

	@Column(name= "starting_date")
	private LocalDate startingDate = LocalDate.now();

	@Column(name= "cover_letter")
	private String coverLetter;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
    private List<College> college;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
    private List<Experience> experience;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
    private List<Image> image;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
    private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
    private List<Skills> skills;
}