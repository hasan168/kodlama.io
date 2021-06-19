package taskday2;

public class CourseManager {

	public void add(Course course) {
		System.out.println("added" + course.getName());
	}

	public void delete(Course course) {
		System.out.println("deleted " + course.getName());
	}

	public void update(Course course) {
		System.out.println("updated " + course.getName());
	}

}