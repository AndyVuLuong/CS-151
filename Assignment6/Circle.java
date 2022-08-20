/**
 * The Circle class is a Shape
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
import java.lang.Math;
public class Circle extends Shape {
	/** Creates radius */
	private double radius;
	
	/** Constructor that takes in 1 argument */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/** Computes area */
	synchronized public double computeArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
	/** Gets radius */
	public double getRadius() {
		return radius;
	}
	
	/** Sets radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Outputs the values of all the attributes of the instance of the class to command line */
	public String toString() {
		return "Circle radius is " + this.getRadius() + " , area is " + Math.round(this.computeArea() * 100.0)/100.0;
	}
	
	/** Run method for threads */
	public void run() {
		this.toString();
	}
}
