/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Employee class program<h1>
 * <h2>Introduction</h2>
 * This program defines the subclass Employee
 * <p>
 * An employee is a person that has an ID, social status, and wage
 * 
 */
public class Employee extends Person {
	private int id;
	private String status;
	private double payAmount;
	
	public Employee(String firstName, String lastName, int age, String social, 
			String address, String gender, float weight, int id, String status, int payAmount) {
		super(firstName, lastName, age, social, address, gender, weight);
		this.id = id;
		this.status = status;
		this.payAmount = payAmount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public double getPayAmount() {
		return payAmount;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void payAmount(int payAmount) {
		this.payAmount = payAmount;
	}
	
	public void introduce() {
		System.out.println(this.getFirstName() + " " + this.getlastName() + " is " + this.getAge() + 
		" years old, " + "has a social security number of " + this.getSocial() + 
		", has an address of " + this.getAddress() + ", is the gender " + this.getGender() + 
		", has a weight of " + this.getWeight() + " lbs, has an id of " + id + 
		", has a status of " + status + ", and has a pay amount of " + payAmount);
		if (status.equals("contractor") || status.equals("part time")) {
			System.out.print("dollars per hour");
		}
		else System.out.print("dollars per year");
	}
	
	public double calculatePay(int time) {
		double pay = 0;
		if (status.equals("contractor") || status.equals("part time")) {
			pay = payAmount * time;
		}
		else pay = payAmount / 52 * time;
		double round = Math.round(pay * 100.0) / 100.0;
		return round;
	}
}
