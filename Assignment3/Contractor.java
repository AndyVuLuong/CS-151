/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A contractor is an employee that is a person
 */
public class Contractor extends Employee{
	/** base pay */
	private Double basePay;
	
	/** Default constructor*/
	public Contractor() {
		super();
	}
	
	/** Constructor with 5 arguments */
	public Contractor(String firstName, String lastName, Address address, int id, Double pay) {
		super(firstName, lastName, address, id);
		basePay = pay;
	}
	
	/** Get base pay*/
	public Double getBasePay() {
		return basePay;
	}
	
	/** Set base pay*/
	public void setBasePay(Double basePay) {
		this.basePay = basePay;
	}
	
	/** toString */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Education: " + getEducation() + ", Direct Deposit: " + 
				getDirectDeposit() + ", Base Pay: " + getBasePay();
	}
	
	/** introduce with Social Security Number */
	public void introduce(boolean displaySSN) {
		System.out.println(toString());
		if(displaySSN) System.out.println("Social Security Number: " + getSSN());
	}
	
	/** compute pay */
	public double computePay(int numHrs) {
		return basePay * numHrs;
	}
}
