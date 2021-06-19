package taskday2;

public class Main {

	public static void main(String[] args) {

		CourseManager courseManager = new CourseManager();
		StudentManager studentManager = new StudentManager();

		Course course1 = new Course(1, "C#", "C# Tutorial");
		Course course2 = new Course(2, "Java", "Java Tutorial");
		Course course3 = new Course(3, "Javascript", "Javascript Tutorial");

		Course[] courses = new Course[] { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.getName() + "  " + course.getTitle());
			courseManager.add(course);
			courseManager.delete(course);
			courseManager.update(course);
		}

		Student student1 = new Student(1, "Ali");
		Student student2 = new Student(2, "Veli");
		Student student3 = new Student(3, "Ahmet");

		Student[] students = new Student[] { student1, student2, student3 };

		for (Student student : students) {
			System.out.println(student.getName());
			studentManager.register(student);
			studentManager.leaving(student);
		}

	}

}
