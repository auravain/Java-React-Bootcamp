package interfaceAbstractDemo.entities;

import java.time.LocalDate;

import interfaceAbstractDemo.abstracts.IEntity;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate DAteOfBirth;
	public String nationaltyId;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, LocalDate dAteOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DAteOfBirth = dAteOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDAteOfBirth() {
		return DAteOfBirth;
	}

	public void setDAteOfBirth(LocalDate dAteOfBirth) {
		DAteOfBirth = dAteOfBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	
}
