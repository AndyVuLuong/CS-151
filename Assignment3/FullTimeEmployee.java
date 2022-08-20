/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A full time employee is an employee that is a person
 */
public abstract class FullTimeEmployee extends Employee {
	/** FullTimeEmployees have a base pay*/
	private Double basePay;
	
	/** Default Constructor*/
	public FullTimeEmployee() {
		super();
	}
	
	/** Constructor with 5 arguments */
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, Double basePay) {
		super(firstName, lastName, address, id);
		this.basePay = basePay;
	}
	
	/** Get base pay */
	public Double getBasePay() {
		return basePay;
	}
	
	/** Set base pay*/
	public void setBasePay(Double pay) {
		basePay = pay;
	}
}
