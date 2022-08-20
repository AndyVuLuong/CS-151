/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * Address object of a person
 */
public class Address {
	/** Number and name of state, city name, zip number, and state name variables*/
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	/** Constructor with 5 attributes */
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	
	/** returns street number */
	public int getStreetNum() {
		return streetNum;
	}
	
	/** returns street name */
	public String getStreetName() {
		return streetName;
	}
	
	/** returns city */
	public String getCity() {
		return city;
	}
	
	/** returns zip */
	public String getZip() {
		return zip;
	}
	
	/** returns state */
	public String getState() {
		return state;
	}
	
	/** set street number*/
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	
	/** set street name */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	/** set city */
	public void setCity(String city) {
		this.city = city;
	}
	
	/** set zip */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/** set state */
	public void setState(String state) {
		this.state = state;
	}
	
	/** toString */
	public String toString() {
		return getStreetNum() + " " + getStreetName() + " " + getCity()
		+ " " + getZip() + " " + getState();
	}
}

