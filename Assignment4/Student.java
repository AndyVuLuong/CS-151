/**
* The Student class creates a student with a name, age, GPA, major, department, and course
*
* @author Andy Luong
* @since 2021-03-03
*/
public class Student {
	/** Creates first name */
	private String firstName;
	/** Creates last name */
	private String lastName;
	/** Creates age */
	private int age;
	/** Creates GPA */
	private float gpa;
	/** Creates major */
	private String major;
	/** Creates department */
	private String department;
	/** Creates course */
	private Course course;
	
	/** Constructor that is for deep copy */
	public Student(Student that) {
	    this(that.getFirstName(), that.getLastName(), that.getAge(), that.getGPA(),
	    		that.getMajor(), that.getDepartment(), that.getCourse());
	}
	
	/** Constructor that takes in 7 arguments */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}
	
	/** Get first name */
	public String getFirstName() {
		return firstName;
	}
	
	/** Get last name */
	public String getLastName() {
		return lastName;
	}
	
	/** Get age */
	public int getAge() {
		return age;
	}
	
	/** Get GPA */
	public float getGPA() {
		return gpa;
	}
	
	/** Get major */
	public String getMajor() {
		return major;
	}
	
	/** Get department */
	public String getDepartment() {
		return department;
	}
	
	/** Get course */
	public Course getCourse() {
		return course;
	}
	
	/** Set first name */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Set last name */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/** Set age */
	public void setAge(int age) {
		this.age = age;
	}
	
	/** Set GPA */
	public void setGPA(float gpa) {
		this.gpa = gpa;
	}
	
	/** Set major */
	public void setMajor(String major) {
		this.major = major;
	}
	
	/** Set department */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/** Set course */
	public void setCourse(Course course) {
		this.course = course;
	}
	
	/** Prints the information using the getters */
	public void printInfo() {
		System.out.println(getFirstName() + ", " + getLastName() + ", " + getAge() + " year old, " +
		getGPA() + " gpa, " + getMajor() + " major, " + getDepartment() + " department, " + getCourse().toString());
	}
}
