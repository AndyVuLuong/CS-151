/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A part time hourly employee is an employee that is a person
 */
public class PartTimeHourly extends Employee {
	/** Part time hourly employees have base hourly pay */
	private Double baseHourlyPay;
	
	/** Default Constructor */
	public PartTimeHourly() {
		super();
	}
	
	/** Constructor with 5 arguments */
	public PartTimeHourly(String firstName, String lastName, Address address, int id, Double pay) {
		super(firstName, lastName, address, id);
		baseHourlyPay = pay;
	}
	
	/** Get hourly pay */
	public Double getHourlyPay() {
		return baseHourlyPay;
	}
	
	/** Set hourly pay */
	public void setHourlyPay(Double pay) {
		baseHourlyPay = pay;
	}
	
	/** toString */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Education: " + getEducation() + ", Direct Deposit: " + 
				getDirectDeposit() + ", Hourly Pay: " + getHourlyPay();
	}
	
	/** introduce */
	public void introduce(boolean displaySSN) {
		System.out.println(toString());
		if(displaySSN) System.out.println("Social Security Number: " + getSSN());
	}
	
	/** Paid by hours */
	public Double computePay(int numHrs) {
		if(numHrs > 40) return -1.0;
		else return getHourlyPay() * numHrs;
	}
}
