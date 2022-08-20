import java.util.ArrayList;
import java.util.Iterator;
/**
 * The Shapes class contains multiple of type Shape
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class Shapes {
	/** Creates a list of shapes */
	private ArrayList<Shape> shapeList;
	
	/** Constructor that takes in one argument */
	public Shapes(ArrayList shapeList) {
		this.shapeList = shapeList;
	}
	
	/** Adds shape */
	public void add(Shape shape) {
		shapeList.add(shape);
	}
	
	/** Removes shape */
	public void remove(Shapes shape) {
		shapeList.remove(shape);
	}
	
	/** Gets shape list */
	public ArrayList getShapeList() {
		return shapeList;
	}
	
	/** Sets shape list */
	public void setShapeList(ArrayList shapeList) {
		this.shapeList = shapeList;
	}
	
	/** Computes */
	public void compute() {
		Iterator<Shape> iterator = getShapeList().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	
	/** Run method for threads */
	public void run() {
		compute();
		System.out.println(toString());
	}
	
	/** Maximum area within list of shapes */
	public Shape max() {
		Shape shape = shapeList.get(0);
		double max = shapeList.get(0).computeArea();
		for(Shape s : shapeList) {
			if(s.computeArea() > max) shape = s;
		}
		return shape;
	}
	
	/** Minimum area within list of shapes */
	public Shape min() {
		Shape shape = shapeList.get(0);
		double min = shapeList.get(0).computeArea();
		for(Shape s : shapeList) {
			if(s.computeArea() < min) shape = s;
		}
		return shape;
	}
	
	/** toString() method to print */
	public String toString() {
		return "The max is shape " + max().getClass() + " of " + Math.round(max().computeArea() * 100.0)/100.0 +
				" and the min is shape " + min().getClass() + " of " + Math.round(min().computeArea() * 100.0)/100.0;
	}
	
}
