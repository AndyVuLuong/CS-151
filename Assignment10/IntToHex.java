import java.util.Scanner;
/**
 * The IntToHex class converts user input of integer to hexadecimal
 *
 * @author Andy Luong
 * @since 2021-05-07
 */
public class IntToHex {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in); //input
		if(scan.hasNextInt()) {
			System.out.println("Hex Value = " + Integer.toHexString(scan.nextInt())); //outputs integer to hex
		} else {
			System.out.println("Input not an integer");
		}
		scan.close(); //close
	}
}
	
