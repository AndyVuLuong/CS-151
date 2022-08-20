/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * An employee is a person
 */
public abstract class Employee extends Person {
	/** Employees specifically have an id, education level, and direct deposit */
	private int id;
	private String educationLevel;
	private boolean directDeposit;
	
	/** Default Constructor */
	public Employee() {
		super();
	}
	
	/** Constructor with 4 arguments */
	public Employee(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		this.id = id;
	}
	
	/** Get ID */
	public int getID() {
		return id;
	}
	
	/** Get education */
	public String getEducation() {
		return educationLevel;
	}
	
	/** Get direct deposit */
	public boolean getDirectDeposit() {
		return directDeposit;
	}
	
	/** Set ID */
	public void setID(int id) {
		this.id = id;
	}
	
	/** Set education */
	public void setEducation(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
	/** Set direct deposit */
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
}
