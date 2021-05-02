package hw1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# Angular","Engin Demirog");
		Course course2 = new Course(2,"Java React","Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giris Icin Temeller","Engin Demirog");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("id: " + course.id);
			System.out.println("Course: " + course.courseName);
			System.out.println("Instructor: " + course.instructor);
			System.out.println("---------");
		}
		
		CourseManager courseManager = new CourseManager ();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.deleteCourse(course3);
	}

}
