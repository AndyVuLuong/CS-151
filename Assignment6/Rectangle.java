/**
 * The Ractangle class is a Shape
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class Rectangle extends Shape{
	/** Creates length */
	private double length;
	/** Creates width */
	private double width;
	
	/** Constructor that takes in 2 argument */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/** Computes area */
	synchronized public double computeArea() {
		return length * width;
	}
	
	/** Gets length */
	public double getLength() {
		return length;
	}
	
	/** Gets width */
	public double getWidth() {
		return width;
	}
	
	/** Sets length */
	public void setRadius(double length) {
		this.length = length;
	}
	
	/** Sets width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Outputs the values of all the attributes of the instance of the class to command line */
	public String toString() {
		return "Rectangle length is " + this.getLength() + ", width is " + this.getWidth() + ", area is " + Math.round(this.computeArea() * 100.0)/100.0;
	}
	
	/** Run method for threads */
	public void run() {
		this.toString();
	}
}
