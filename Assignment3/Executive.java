/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * An executive is an employee that is a person
 */
public class Executive extends Employee {
	/** Executives have a yearly bonus and yearly compensation */
	private Double yearlyBonus;
	private Double yearlyCompensation;

	/** Default Constructor*/
	public Executive() {
		super();
	}
	
	/** Constructor with 6 arguments */
	public Executive(String firstName, String lastName, Address address, int id, Double pay, Double bonus) {
		super(firstName, lastName, address, id);
		yearlyCompensation = pay;
		yearlyBonus = bonus;
	}
	
	/** Get bonus */
	public Double getBonus() {
		return yearlyBonus;
	}
	
	/** Set bonus */
	public void setBonus(Double bonus) {
		yearlyBonus = bonus;
	}
	
	/** Get compensation */
	public Double getCompensation() {
		return yearlyCompensation;
	}
	
	/** Set compensation */
	public void setCompensation(Double compensation) {
		this.yearlyCompensation = compensation;
	}
	
	/** toString */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Education: " + getEducation() + ", Direct Deposit: " + 
				getDirectDeposit() + ", Compensation: " + getCompensation() + ", Bonus: " + getBonus();
	}
	
	/** introduce */
	public void introduce(boolean displaySSN) {
		System.out.println(toString());
		if(displaySSN) System.out.println("Social Security Number: " + getSSN());
	}
	
	/** Executive gets paid with both compensation and bonus */
	public Double computePay() {
		return getCompensation() + getBonus();
	}
}
