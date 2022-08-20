/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Student output program<h1>
 * <h2>Introduction</h2>
 * This is a program that will use both the Student.java and Person.java to
 * test the output of when a Student object is instantiated.
 * <h2>Compile instructions</h2>
 * Compile by running the following command:
 * <i>javac StudentTest.java</i>
 * <h2>Execute instructions</h2>
 * Execute by running the following command:
 * <i>java StudentTest</i>
 * <p>
 * This program will output the details of John Smith, a computer scientist
 * 
 */
public class StudentTest {
	public static void main(String args[]) {
		Student John = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
		System.out.println(John.getFirstName() + " " + John.getLastName() + " is " + John.getAge() + " years old, has a GPA of " +
		John.getGPA() + ", is a " + John.getMajor() + " major, and is in the " + John.getDepartment() + " department.\n" + John.getFirstName() + "'s schedule is the following:");
		Student.Course course = new Student.Course();
		course.printSchedule();
	}
}