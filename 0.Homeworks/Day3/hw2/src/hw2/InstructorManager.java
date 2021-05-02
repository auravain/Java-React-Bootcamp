package hw2;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User instructor) {
		System.out.println("Eðitmen Eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
}
