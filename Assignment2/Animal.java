/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Animal class program<h1>
 * <h2>Introduction</h2>
 * This program defines the superclass Animal
 * <p>
 * Each animal has a type, name, age, gender, environment, and speed
 * 
 */
public class Animal {
	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private double speed;
	
	public Animal(String type, String name, int age, String gender, String environment, double speed) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getEnvironment() {
		return environment;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getGender(String gender) {
		this.gender = gender;
	}
	
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("Moving");
	}
	
	public void sound() {
		System.out.println("Sounding");
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public String toString() {
		return name + " is a " + type + ", age " + age + ", " + gender + ", " + environment + " is its environemnt,"
				+ " and it moves at the rate of " + speed + " miles/hr";
	}
}
