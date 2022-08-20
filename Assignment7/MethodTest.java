import java.util.ArrayList;
/**
 * The MethodTest class uses Java generics to print amountn of objects in a list
 *
 * @author Andy Luong
 * @since 2021-04-5
 */
public class MethodTest {
	
	/** counts number of generic objects in a list
	 * @param <T> */
	public static <T> int count(ArrayList<T> list) {
		int count = 0;
		for(T e : list) {
			count++;
		}
		return count;
	}
	
	/** Creates arrays and prints number of elements */
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(5);
		arr.add("a"); arr.add("b"); arr.add("c"); arr.add("d");	arr.add("e");
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(6);
		for(int i = 1; i <= 6; i++) arr2.add(i);
		
		ArrayList<Double> arr3 = new ArrayList<Double>(8);
		for(double i = 1.0; i <= 8.0; i++) arr3.add(i);
		
		System.out.println("This list has " + count(arr) + " elements");
		System.out.println("This list has " + count(arr2) + " elements");
		System.out.println("This list has " + count(arr3) + " elements");
	}
}
