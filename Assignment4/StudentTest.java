/**
* The StudentTest class creates instances of Student class and prints their information
*
* @author Andy Luong
* @since 2021-03-03
*/
public class StudentTest {
	/** Another instance of Student class is created, which is a clone (deep copy) of the first student */
	public static void main(String args[]) {
		Course course = new Course("CS151", "Objected Oriented Design and Programming", "CS", 6, "Tue");
		Student student = new Student("John", "Smith", 20, 3.6f, "Computer Science", 
				"School of Computer Science", course);
		Student student2 = new Student(student);
		student.printInfo();
		student2.printInfo();
	}
}
