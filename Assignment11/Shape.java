/**
 * The Shape class is the parent class
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class Shape {
	/** Creates measurement */
	private double measurement;
	
	/** Default constructor */
	public Shape() {
		super();
	}
	
	/** Constructor that takes in one argument */
	public Shape(double measurement) {
		this.measurement = measurement;
	}
	
	/** Computes area */
	synchronized public double computeArea() {
		return 0;
	}
}
