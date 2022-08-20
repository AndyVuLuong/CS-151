/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Person class program<h1>
 * <h2>Introduction</h2>
 * This program defines the superclass Person
 * <p>
 * Each person has a first and last name, age, social, address, gender, and weight
 * 
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String social;
	private String address;
	private String gender;
	float weight;
	
	public Person() {	
	}
	
	public Person(String firstName, String lastName, int age, String social, 
		String address, String gender, float weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.social = social;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getSocial() {
		return social;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public float getWeight() {
		return weight;
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

	public void setSocial(String social) {
		this.social = social;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void introduce() {
		System.out.println(firstName + " " + lastName + " is " + age + 
				" years old, " + "has a social security number of " + social + 
				", has an address of " + address + ", is the gender " + gender + 
				", and has a weight of " + weight);
	}
}

