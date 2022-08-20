import java.util.ArrayList;
/**
 * The ShapeTest class runs the various areas of different types of shape
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class ShapeTest {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Shape> shapeList1 = new ArrayList<>();
		ArrayList<Shape> shapeList2 = new ArrayList<>();
		Shapes shapes1 = new Shapes(shapeList1);
		Shapes shapes2 = new Shapes(shapeList2);
		Circle circle1 = new Circle(1.0);
		Circle circle2 = new Circle(2.0);
		Hexagon hexagon1 = new Hexagon(1.0);
		Hexagon hexagon2 = new Hexagon(20.0);
		Rectangle rectangle1 = new Rectangle(1.0, 2.0);
		Rectangle rectangle2 = new Rectangle(3.0, 4.0);
		Triangle triangle1 = new Triangle(1.0, 2.0);
		Triangle triangle2 = new Triangle(3.0, 4.0);

		shapes1.add(circle1);
		shapes1.add(hexagon1);
		shapes1.add(rectangle1);
		shapes1.add(triangle1);
		shapes2.add(circle2);
		shapes2.add(hexagon2);
		shapes2.add(rectangle2);
		shapes2.add(triangle2);
		

		
		Thread t1 = new Thread() {
			public void run() {
				shapes1.run();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				shapes2.run();
			}
		};
		t1.start();
		t2.sleep(1000);
		t2.start();
		
		/*
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) { 
				System.out.println(e);
			}
		*/
		/*
		System.out.println(shapes1.getShapeList().get(0).toString());
		System.out.println(shapes1.getShapeList().get(1).toString());
		System.out.println(shapes1.getShapeList().get(2).toString());
		System.out.println(shapes1.getShapeList().get(3).toString());
		System.out.println(shapes2.getShapeList().get(0).toString());
		System.out.println(shapes2.getShapeList().get(1).toString());
		System.out.println(shapes2.getShapeList().get(2).toString());
		System.out.println(shapes2.getShapeList().get(3).toString());
		*/
		
		/*
		Shape o = shapeList1.get(0);
		if(o instanceof Circle) {
			Circle child = (Circle) o;
			shapeList1.set(0, child);
			shapeList1.get(0).computeArea();
		}
		System.out.println(shapeList1.get(0).computeArea());
		*/
	
		/*
		System.out.println(shapes1.min(shapes1.getShapeList()));
		System.out.println(shapes1.max(shapes2.getShapeList()));
		*/
	
	}
}
