package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_posts"})
public class Employer extends User{

	@Column(name = "website")
	private String website;
	
	@Column(name = "phone_number")
	private String phone;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "confirmation")
	private boolean confirmation;
	
	@JsonIgnore
    @OneToMany(mappedBy = "employer")
    private List<JobPost> jobPost;

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setConfirmation(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
