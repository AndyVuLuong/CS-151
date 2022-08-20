/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Student class program<h1>
 * <h2>Introduction</h2>
 * This program defines the class Student
 * <p>
 * A student has a first and last name, age, gpa, major, and department
 * 
 */
public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;

	public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public float getGPA() {
		return gpa;
	}

	public String getMajor() {
		return major;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGPA(float gpa) { 
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public static class Course {
		public void printSchedule() {
			System.out.println("CS151 Tue/Thur 6-7:15");
			System.out.println("Eng101 Mon/Wed 10-11:15" );
			System.out.println("Hist100 Tue/Thur 1:30-2:45");
		}
	}
}