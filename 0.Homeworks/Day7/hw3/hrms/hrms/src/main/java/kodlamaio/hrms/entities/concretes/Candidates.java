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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class Candidates extends User {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;

		
		@Column(name = "first_name")
		private String firstName;
		
		
		@Column(name = "last_name")
		private String lastName;

		
		@Column(name = "national_identity")
		private String nationalIdentity;
		
		
		@Column(name = "birth_of_date")
		private String birthOfDate;


		public String getNationalIdentity() {
			// TODO Auto-generated method stub
			return null;
		}


		public String getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}


		public String getLastName() {
			// TODO Auto-generated method stub
			return null;
		}


		public int getBirthOfDate() {
			// TODO Auto-generated method stub
			return 0;
		}
	

}