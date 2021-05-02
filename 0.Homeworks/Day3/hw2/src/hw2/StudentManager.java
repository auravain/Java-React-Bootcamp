package hw2;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User student) {
		System.out.println("Öğrenci Eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
}
