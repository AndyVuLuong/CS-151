/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A full time salaried employee is a full time employee that is an employee that is a person
 */
public class FullTimeSalaried extends FullTimeEmployee{
	/** Default Constructor */
	public FullTimeSalaried() {
		super();
	}
	
	/** Constructor with 5 arguments */
	public FullTimeSalaried(String firstName, String lastName, Address add, int id, Double salary) {
		super(firstName, lastName, add, id, salary);
	}
	
	/** toString */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Education: " + getEducation() + ", Direct Deposit: " + 
				getDirectDeposit() + ", Base Pay: " + getBasePay();
	}
	
	/** introduce */
	public void introduce(boolean displaySSN) {
		System.out.println(toString());
		if(displaySSN) System.out.println("Social Security Number: " + getSSN());
	}
	
	/** Paid by weeks */
	public Double computePay(int numWeeks) {
		return getBasePay() * numWeeks;
	}
}
