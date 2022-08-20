import java.util.ArrayList;
import java.io.*;
/**
 * The ShapeTest class runs the various areas of different types of shape with serializable
 *
 * @author Andy Luong
 * @since 2021-05-12
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
		
        String fileName1 = "./obj1.ser";
        String fileName2 = "./obj2.ser";
        String fileName3 = "./obj3.ser";
        String fileName4 = "./obj4.ser";
        String fileName5 = "./obj5.ser";
        String fileName6 = "./obj6.ser";
        String fileName7 = "./obj7.ser";
        String fileName8 = "./obj8.ser";
          
        //Serialization 
        try
        {   
            FileOutputStream file1 = new FileOutputStream(fileName1);
            ObjectOutputStream out1 = new ObjectOutputStream(file1);              
            out1.writeObject(circle1);
            out1.close();
            file1.close();
            System.out.println("Object1 has been serialized");
            
            
            FileOutputStream file2 = new FileOutputStream(fileName2);
            ObjectOutputStream out2 = new ObjectOutputStream(file2);              
            out2.writeObject(circle2);
            out2.close();
            file2.close();
            System.out.println("Object2 has been serialized");
            
            FileOutputStream file3 = new FileOutputStream(fileName3);
            ObjectOutputStream out3 = new ObjectOutputStream(file3);              
            out3.writeObject(hexagon1);
            out3.close();
            file3.close();
            System.out.println("Object3 has been serialized");
            
            FileOutputStream file4 = new FileOutputStream(fileName4);
            ObjectOutputStream out4 = new ObjectOutputStream(file4);              
            out4.writeObject(hexagon2);
            out4.close();
            file4.close();
            System.out.println("Object4 has been serialized");
            
            FileOutputStream file5 = new FileOutputStream(fileName5);
            ObjectOutputStream out5 = new ObjectOutputStream(file5);              
            out5.writeObject(rectangle1);
            out5.close();
            file1.close();
            System.out.println("Object1 has been serialized");
            
            FileOutputStream file6 = new FileOutputStream(fileName6);
            ObjectOutputStream out6 = new ObjectOutputStream(file6);              
            out6.writeObject(rectangle2);
            out6.close();
            file6.close();
            System.out.println("Object6 has been serialized");
            
            FileOutputStream file7 = new FileOutputStream(fileName7);
            ObjectOutputStream out7 = new ObjectOutputStream(file7);              
            out7.writeObject(triangle1);
            out7.close();
            file7.close();
            System.out.println("Object7 has been serialized");
            
            FileOutputStream file8 = new FileOutputStream(fileName8);
            ObjectOutputStream out8 = new ObjectOutputStream(file8);              
            out8.writeObject(triangle2);
            out8.close();
            file8.close();
            System.out.println("Object8 has been serialized");
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        //Demo object1 = null;
		
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
