import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap; 
import java.util.Map; 
/**
 * The ListManipular class sorts a list of integers
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class ListManipulator {
	
	/** If true, sorts integer from least to greatest and vice versa */
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending) {
		if(ascending) {
			Collections.sort(myLst);
			return myLst;
		}
		else {
			Collections.sort(myLst, Collections.reverseOrder()); 
			return myLst;
		}
	}
	
	/** Swaps the largest integer in a list with the smallest integer */
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		int smallest = 0;
		int largest = 0;
		for(int i = 0; i < myLst.size(); i++) {
			int current = myLst.get(i);
	        if (myLst.get(largest) < current) {
	            largest = i;
	        }
	        if (myLst.get(smallest) > current) {
	            smallest = i;
	        }
		}
		int temp = myLst.get(largest);
		myLst.set(largest, myLst.get(smallest));
		myLst.set(smallest, temp);
		return myLst;
	}
	
	/** Make a table with HashMap to record frequency of integers in a list */
	public void table(ArrayList<Integer> myLst) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); 	  
        for (Integer i : myLst) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
        
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times"); 
        } 
	}
	
//Test output
/*
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ListManipulator lm = new ListManipulator();
		arr.add(2);
		arr.add(7);
		arr.add(7);
		arr.add(4);
		arr.add(1);
		arr.add(6);
		ArrayList<Integer> ascendingArray = new ArrayList<Integer>(arr);
		ArrayList<Integer> decendingArray = new ArrayList<Integer>(arr);
		ArrayList<Integer> swapLargestSmallestArray = new ArrayList<Integer>(arr);
		ascendingArray = lm.sort(ascendingArray, true);
		decendingArray = lm.sort(decendingArray, false);
		swapLargestSmallestArray = lm.swapLargestSmallest(swapLargestSmallestArray);
		
		System.out.println("Original");
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
		System.out.println("\nAscending");
		for(int i = 0; i < ascendingArray.size(); i++) {
			System.out.print(ascendingArray.get(i) + " ");
		}
		
		System.out.println("\nDecending");
		for(int i = 0; i < decendingArray.size(); i++) {
			System.out.print(decendingArray.get(i) + " ");
		}
		
		System.out.println("\nSwap Largest Smallest");
		for(int i = 0; i < swapLargestSmallestArray.size(); i++) {
			System.out.print(swapLargestSmallestArray.get(i) + " ");
		}
		
		System.out.println("\n\nUnique Table of Original Array");
		lm.table(arr);
	}
*/
}
