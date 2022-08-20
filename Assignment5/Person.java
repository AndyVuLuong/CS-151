/**
 * The Course class implements an application that constructs a course
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class Person {
	/** Creates first name */
	private String firstName;
	/** Creates last name */
	private String lastName;
	/** Creates age */
	private int age;
	
	/** Constructor that takes in 3 arguments */
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/** Gets first name */
	public String getFirstName() {
		return firstName;
	}
	
	/** Gets last name */
	public String getLastName() {
		return lastName;
	}

	/** Gets age */
	public int getAge() {
		return age;
	}
	
	/** Sets first name */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Sets last name */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** Sets age */
	public void setAge(int age) {
		this.age = age;
	}
	
	/** Method used to return information of Person */
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getAge();
	}
	
	/** Method used to print information of Person */
	public void introduce() {
		System.out.println(toString());
	}
}

