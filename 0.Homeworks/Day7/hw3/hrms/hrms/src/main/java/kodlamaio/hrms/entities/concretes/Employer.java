package kodlamaio.hrms.entities.concretes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;


@Data
@Entity
@Table(name = "employer")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;

		@Column(name = "company_name")
		private String companyName;
		
		@Column(name = "website")
		private String website;
		
		@Column(name = "phone_number")
		private String phoneNumber;
	

}