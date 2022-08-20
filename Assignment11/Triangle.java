import java.io.*;
/**
 * The Triangle class
 *
 * @author Andy Luong is a Shape
 * @since 2021-05-12
 */
public class Triangle extends Shape implements Serializable {
	/** Creates base */
	private double base;
	/** Creates height */
	private double height;
	
	/** Constructor that takes in 2 argument */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/** Computes area */
	synchronized public double computeArea() {
		return base*height/2;
	}
	
	/** Gets base */
	public double getBase() {
		return base;
	}
	
	/** Get height */
	public double getHeight() {
		return height;
	}
		
	/** Sets base */
	public void setBase(double base) {
		this.base = base;
	}
	
	/** Sets height */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Outputs the values of all the attributes of the instance of the class to command line */
	public String toString() {
		return "Triangle base is " + this.getBase() + ", height is " + this.getHeight() + ", area is " + Math.round(this.computeArea() * 100.0)/100.0;
	}
	
	/** Run method for threads */
	public void run() {
		this.toString();
	}
}
