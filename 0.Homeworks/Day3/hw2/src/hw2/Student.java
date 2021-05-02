package hw2;

public class Student extends User {
	
	String homeworksToDo;

	public Student() {
	}

	public Student(int id, String firstName, String lastName, String email, String password, String homeworksToDo) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.homeworksToDo = homeworksToDo;
		
	}

	public String getHomeworksToDo() {
		return homeworksToDo;
	}
	public void setHomeworksToDo(String homeworksToDo) {
		this.homeworksToDo = homeworksToDo;
	}

}
