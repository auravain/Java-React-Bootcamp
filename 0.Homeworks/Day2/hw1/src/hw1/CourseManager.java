package hw1;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println("Kurs Eklendi. - " + course.courseName);
	}
	
	public void deleteCourse(Course course) {
		System.out.println("Kurs Silindi. - " + course.courseName);
	}

}
