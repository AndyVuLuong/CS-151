import java.lang.reflect.*;
/**
 * The ReflectionTest prints scenarios of combinations of declared/all of methods/fields of person/address
 *
 * @author Andy Luong
 * @since 2021-05-07
 */
public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		//Creates address and person
		Address a = new Address(1954, "Tia Place", "San Jose", "95131", "California");
		Person p = new Person("Andy", "Luong", a);
		
		//1. Print out all methods declared in class Person
        Class cls = p.getClass();
        System.out.println("The declared methods of class " + cls.getName() + " are: ");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
        	System.out.println(method.getName() + " has " + method.getParameterCount() + " input parameters");
        	if(method.getParameterCount() > 0) {
        		System.out.println("Input parameter types: ");	
            	Class[] parameters = method.getParameterTypes();
            	for (Class classobject : parameters) System.out.println(classobject.getName() + " ");
        	}
        }
        System.out.println();

        
        //2. Print out all methods available to class Address
        Class cls2 = a.getClass();
        System.out.println("The available methods of class " + cls2.getName() + " are: ");
        Method[] methods2 = cls2.getMethods();
        for (Method method2 : methods2) {
        	System.out.println(method2.getName() + " has " + method2.getParameterCount() + " input parameters");
        	if(method2.getParameterCount() > 0) {
        		System.out.println("Input parameter types: ");	
            	Class[] parameters = method2.getParameterTypes();
            	for (Class classobject : parameters) System.out.println(classobject.getName() + " ");
        	}
        }
        System.out.println();
        
        //3.Print out all fields declared in class Address
        System.out.println("The declared fields of class " + cls2.getName() + " are: ");
        Field[] fields = cls2.getDeclaredFields();
        for (Field field : fields) {
        	System.out.println(field.getName() + " has " + field.getModifiers() + " access modifer and "
        			+ field.getType() + " type of the field");
        }
        System.out.println();
        
        //4. Instantiate 3 new instances of class Person with 3 new instances of class Address via reflection
        System.out.println("3 instances of class Person with 3 instances of Address using reflection");
        Constructor cons2 = cls2.getConstructor(int.class, String.class, String.class, String.class, String.class);
        Address a2 = (Address) cons2.newInstance(1234, "Oakland Place", "San Jose", "95133", "California");
        Address a3 = (Address) cons2.newInstance(3456, "Ridge Circle", "San Jose", "95131", "California");
        Address a4 = (Address) cons2.newInstance(5678, "Sawgrass Groove", "San Jose", "95135", "California");
        Person p2 = new Person("Jordan", "Mai", a2);
        Person p3 = new Person("Julio", "Santillan", a3);
        Person p4 = new Person("Aileen", "Tran", a4);
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getAddress());
        System.out.println(p3.getFirstName() + " " + p3.getLastName() + " " + p3.getAddress());
        System.out.println(p4.getFirstName() + " " + p4.getLastName() + " " + p4.getAddress());
        System.out.println();
        
    
        //5. invoke setFirstName(), setLastName(), setAge()
        System.out.println("Invoke setFirstName(), setLastName(), setAge()");
        Address a5 = (Address) cons2.newInstance(1111, "Starshine Street", "New York", "12345", "New York");
        Person p5 = new Person("Max", "Payne", a5);
        System.out.println("Before: " + p5.getFirstName() + " " + p5.getLastName() + " " + p5.getAddress());
        Method method3 = cls.getDeclaredMethod("setFirstName", String.class);
        method3.invoke(p5, "Sophine");
        Method method4 = cls.getDeclaredMethod("setLastName", String.class);
        method4.invoke(p5, "Tran");
        Method method5 = cls.getDeclaredMethod("setAge", int.class);
        method5.invoke(p5, 17);
        System.out.println("After: " + p5.getFirstName() + " " + p5.getLastName() + " " + p5.getAge() + " " + p5.getAddress());
        
        
	}
}
