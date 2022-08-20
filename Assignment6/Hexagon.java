import java.lang.Math;
/**
 * The Hexagon class is a Shape
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class Hexagon extends Shape{
	/** Creates side */
	private double side;
	
	/** Constructor that takes in 1 argument */
	public Hexagon(double side) {
		this.side = side;
	}
	
	/** Computes area */
	synchronized public double computeArea() {
		return 3*Math.sqrt(3)/2*side;
	}
	
	/** Gets side */
	public double getSide() {
		return side;
	}
	
	/** Sets side */
	public void setSide(double side) {
		this.side = side;
	}
	
	/** Outputs the values of all the attributes of the instance of the class to command line */
	public String toString() {
		return "Hexagon side is " + this.getSide() + " , area is " + Math.round(this.computeArea() * 100.0)/100.0;
	}
	
	/** Run method for threads */
	public void run() {
		this.toString();
	}
}
