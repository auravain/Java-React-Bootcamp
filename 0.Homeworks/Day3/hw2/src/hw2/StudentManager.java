package hw2;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User student) {
		System.out.println("��renci Eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
}
