import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * The ReadFileInput class reads a file and output it into the console
 *
 * @author Andy Luong
 * @since 2021-05-07
 */
public class ReadFileInput {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File ("quote.txt")); //reads file
		while(scan.hasNextLine()) System.out.println(scan.nextLine()); //prints out to console
		scan.close(); //close
	}
}
	
