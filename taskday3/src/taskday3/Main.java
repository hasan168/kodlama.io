package taskday3;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		Instructor instructor = new Instructor();
		Student student = new Student();

		instructor.setId(1);
		instructor.setFirstname("Ali");
		instructor.setLastName("Veli");
		instructor.setCourses("C#");

		student.setId(1);
		student.setFirstname("Ahmet");
		student.setLastName("Mehmet");
		student.setSchool("High School");

		User[] user = new User[] { instructor, student };

		userManager.addMultiple(user);

		instructorManager.update(instructor);
		studentManager.add(student);
		studentManager.delete(student);

	}

}
