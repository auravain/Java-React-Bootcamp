package kodlamaio.hrms.entities.concretes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Column;

@Entity
@Table(name = "employees")
@Data
public class Employee extends User {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;

		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
	

}
