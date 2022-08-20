import java.io.FileWriter;
import java.util.Scanner;
/**
 * The CreateFile class writes user input into a created file called "command_line_input.txt" until line with "@q"
 *
 * @author Andy Luong
 * @since 2021-05-07
 */
public class CreateFile {
	public static void main (String[] args) {
		System.out.println("Type anything in each line and type @q in separate line to exit");
		try {
			Scanner scan = new Scanner(System.in); //input
			FileWriter fw = new FileWriter("command_line_input.txt"); //create file
			while(true){
			    String input = scan.nextLine(); //each line
			    if("@q".equals(input.trim())) break; //exits when line contains "@q"
			    fw.append(input); //appends to file
			}
			scan.close(); fw.close(); //close	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
