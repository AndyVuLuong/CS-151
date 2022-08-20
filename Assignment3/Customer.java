/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * A customer is a person
 */
public class Customer extends Person{
	/** Customer identification and pay preference */
	private int customerID;
	private String payPreference;
	
	/** Default constructor */
	public Customer() {
		super();
	}
	
	/** Constructor with 4 arguments */
	public Customer(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		this.customerID = id;
	}
	
	/** Get ID */
	public int getID() {
		return customerID;
	}
	
	/** Set ID */
	public void setID(int customerID) {
		this.customerID = customerID;
	}
	
	/** Get pay preference */
	public String getPayPreference() {
		return payPreference;
	}
	
	/** Set pay preference */
	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}
	
	/** toString */
	public String toString() {	
		return "Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Address: " + 
				getAddress() + ", ID: " + getID() + ", Pay Preference: " + getPayPreference();
	}
	
	/** introduce */
	public void introduce() {
		System.out.println(this.toString());
	}
	
	/** Customer has made a payment */
	public void makePayment() {
		System.out.println("Payment made");
	}
}
