package hw2;

public class Instructor extends User {
	
	String description;
	
	public Instructor() {
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String description) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}