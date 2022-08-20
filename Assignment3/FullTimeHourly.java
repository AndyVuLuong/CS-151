/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A full time hourly employee is a full time employee that is an employee that is a person
 */
public class FullTimeHourly extends FullTimeEmployee{
	/** FullTimeHourly Employees have an overtimePay */
	private Double overtimePay;

	/** Default Constructor */
	public FullTimeHourly() {
		super();
	}
	
	/** Constructor with 6 arguments */
	public FullTimeHourly(String firstName, String lastName, Address add, int id, Double basePay, Double overtime) {
		super(firstName, lastName, add, id, basePay);
		overtimePay = overtime;
	}
	
	/** Get overtime pay*/
	public Double getOvertimePay() {
		return overtimePay;
	}
	
	/** Set overtime pay*/
	public void setOvertime(Double overtimePay) {
		this.overtimePay = overtimePay;
	}
	
	/** toString */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Education: " + getEducation() + ", Direct Deposit: " + 
				getDirectDeposit() + ", Base Pay: " + getBasePay() + ", Overtime Pay: " + getOvertimePay();
	}
	
	/** introduce */
	public void introduce(boolean displaySSN) {
		System.out.println(toString());
		if(displaySSN) System.out.println("Social Security Number: " + getSSN());
	}
	
	/** Paid by weeks with overtime pay */
	public Double computePay(int numWeeks) {
		return getBasePay() * numWeeks + overtimePay;
	}
}
