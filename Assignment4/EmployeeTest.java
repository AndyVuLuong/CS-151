/**
* The EmployeeTest class creates instances of Employee class and prints the computed pay
*
* @author Andy Luong
* @since 2021-03-03
*/
public class EmployeeTest {
	/** An employee John is created with 6 different hours to check if hours are valid */
	public static void main (String args[]) {
		Employee John = new Employee("John", "Smith", 101, 35);
		System.out.println("40 hours = $" + John.computePay(40));
		System.out.println("23 hours = $" + John.computePay(23));
		System.out.println("1 hours = $" + John.computePay(1));
		System.out.println("0 hours = $" + John.computePay(0));
		System.out.println("-5 hours = $" + John.computePay(-5));
		System.out.println("45 hours = $" + John.computePay(45));
	}
}
