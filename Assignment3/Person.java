/** 
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * Every worker and customer has the attributes of a person
 */
public abstract class Person {
	/** A person has a name, age, social security number, and address */
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	
	/** Default constructor */
	public Person() {
		super();
	}
	
	/** Constructor */
	public Person(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
	
	/** Get SSN */
	public String getSSN() {
		return ssn;
	}
	
	/** Get address */
	public Address getAddress() {
		return address;
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
	
	/** Set SSN */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/** Set address */
	public void setAddress(Address address) {
		this.address = address;
	}
}