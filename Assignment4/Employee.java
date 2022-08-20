/**
* The Employee class creates an employee with a name, ID, and hourly pay.
* The class computes a pay given hours and has NumberFormatException and custom TooManyHoursWorkedException
* 
* @author Andy Luong
* @since 2021-03-03
*/
public class Employee {
	/** Creates first name */
	private String firstName;
	/** Creates last name */
	private String lastName;
	/** Creates Employee ID */
	private int employeeID;
	/** Creates hourly pay */
	private float hourlyPay;
	
	/** Constructor that takes in 4 arguments */
	public Employee(String firstName, String lastName, int employeeID, float hourlyPay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.hourlyPay = hourlyPay;
	}
	
	/** Gets first name */
	public String getFirstName() {
		return firstName;
	}
	
	/** Gets last name */
	public String getLastName() {
		return lastName;
	}
	
	/** Gets employee ID */
	public int getEmployeeID() {
		return employeeID;
	}
	
	/** Gets hourly pay */
	public float getHourlyPay() {
		return hourlyPay;
	}
	
	/** Sets first name */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Sets last name */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/** Sets employee ID */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	/** Sets hourly pay */
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	/** Creates custom exception if hours exceed 40 */
	public class TooManyHoursWorkedException extends RuntimeException {
		public TooManyHoursWorkedException(String errorMessage) {
			super(errorMessage);
		}
	}
	
	/** Computes pay given hours with NumberFormatException and TooManyHoursWorkedException */
	public float computePay(int hours) {
		try {
			if(hours < 0) {
				throw new NumberFormatException("number of hours is invalid");
			} else if(hours > 40) {
				throw new TooManyHoursWorkedException("number of hours is over 40");
			} else {
				return getHourlyPay() * hours;
			}	
		} catch(Exception e)  {
			System.out.println(e);
		}
		System.out.println("$" + getHourlyPay() * hours + " if valid");
		return 0f;
	}
}
