import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
/**
* The Student class creates a student with a first ame, age, GPA, major, department, and course
*
* @author Andy Luong
* @since 2021-03-10
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
	private LinkedList<Course> courseList;
	
	/** Constructor that takes in 7 arguments */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
		courseList = new LinkedList<Course>();
		courseList.add(course);
	}
	
	/** Adds course */
	public void addCourse(String name, String description, String department, int time, String weekday) {
		Course course = new Course(name, description, department, time, weekday);
		courseList.add(course);
	}
	
	/** Removes course 8 */
	public void removeCourse() {
		courseList.remove();
	}
	
	/** Sorts the attributes of Course class based of if user wants that specific attribute to sort from least to greatest or vice versa */
	public void sortCourse(boolean ascending, String type) {
		if(ascending && (type.equals("name"))) {
			System.out.println("Ascending name");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o1.getName().compareTo(o2.getName());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(ascending && (type.equals("description"))) {
			System.out.println("Ascending description");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o1.getDescription().compareTo(o2.getDescription());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(ascending && (type.equals("department"))) {
			System.out.println("Ascending department");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o1.getDepartment().compareTo(o2.getDepartment());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(ascending && (type.equals("time"))) {
			System.out.println("Ascending time");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o1.getTime() - o2.getTime();
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(ascending && (type.equals("weekday"))) {
			System.out.println("Ascending weekday");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o1.getWeekday().compareTo(o2.getWeekday());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(!ascending && (type.equals("name"))) {
			System.out.println("Descending name");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
				      return o2.getName().compareTo(o1.getName());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(!ascending && (type.equals("description"))) {
			System.out.println("Descending description");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
					   return o2.getDescription().compareTo(o1.getDescription());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(!ascending && (type.equals("department"))) {
			System.out.println("Descending department");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
					      return o2.getDepartment().compareTo(o1.getDepartment());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(!ascending && (type.equals("time"))) {
			System.out.println("Descending time");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
					   return o2.getTime() - o1.getTime();
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
		
		if(!ascending && (type.equals("weekday"))) {
			System.out.println("Descending weekday");
			Collections.sort(courseList, new Comparator<Course>(){
				   public int compare(Course o1, Course o2){
					   return o2.getWeekday().compareTo(o1.getWeekday());
				   } });
			for(Course c : courseList) System.out.println(c.toString());
		}
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
	
	/** Get list of courses */
	public LinkedList<Course> getCourseList() {
		return courseList;
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
	
	/** Set course list */
	public void setCourseList(LinkedList<Course> courseList) {
		this.courseList = courseList;
	}
	
	/** Prints the information using the getters */
	public void printInfo() {
		System.out.println(getFirstName() + ", " + getLastName() + ", " + getAge() + " year old, " +
		getGPA() + " gpa, " + getMajor() + " major, " + getDepartment() + " department, " + getCourse().toString());
	}
	
	//Test output
	/*
	public static void main(String[] args) {
		Course course1 = new Course("CS151", "Objected Oriented Design and Programming", "CS", 6, "Tue");
		Student student1 = new Student("John", "Smith", 20, 3.6f, "Computer Science", 
				"School of Computer Science", course1);
		student1.addCourse("MATH161A", "Statistics", "MATH", 4, "Wed");
		student1.addCourse("KIN35B", "Intermediate Weight Training", "KIN", 8, "Fri");
		student1.sortCourse(true, "name");
		student1.sortCourse(false, "time");
	}
	*/
}
