/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Employee output program<h1>
 * <h2>Introduction</h2>
 * This is a program that will use Employee.java and Person.java to
 * test the output of when an Employee with Person as its parent is instantiated.
 * <h2>Compile instructions</h2>
 * Compile by running the following command:
 * <i>javac EmployeeTest.java</i>
 * <h2>Execute instructions</h2>
 * Execute by running the following command:
 * <i>java EmployeeTest</i>
 * <p>
 * This program will output 5 different Employees with their own name, age, ID, address, wage, and working status
 *
 */
public class EmployeeTest {
	public static void main(String args[]) {
		Employee Smith = new Employee("Joe", "Smith", 25, "111-11-1111", "1000 Smith Drive",
				"male", 150.23f, 11111111, "contractor", 60);
		Smith.introduce();
		System.out.println("\nWhen Smith works for 30 hours, he earns " + Smith.calculatePay(30) + " dollars\n");
		
		Employee Gray = new Employee("Lisa", "Gray", 30, "222-22-2222", "2000 Gray Drive",
				"female", 125.67f, 22222222, "full time", 110000);
		Gray.introduce();
		System.out.println("\nWhen Gray works for 2 weeks, she earns " + Gray.calculatePay(2) + " dollars\n");
		
		Employee Briggs = new Employee("Timothy", "Briggs", 40, "333-33-3333", "3000 Briggs Drive",
				"male", 205.87f, 33333333, "full time", 80000);
		Briggs.introduce();
		System.out.println("\nWhen Briggs works for 4 weeks, he earns " + Briggs.calculatePay(4) + " dollars\n");
		
		Employee Wallace = new Employee("George", "Wallace", 35, "444-44-4444", "4000 Wallace Drive",
				"male", 175.42f, 44444444, "part time", 20);
		Wallace.introduce();
		System.out.println("\nWhen Wallace works for 25 hours, he earns " + Wallace.calculatePay(25) + " dollars\n");
		
		Employee Student = new Employee("Amy", "Student", 20, "555-55-5555", "5000 Student Drive",
				"female", 110.91f, 5555555, "contractor", 45);
		Student.introduce();
		System.out.println("\nWhen Student works for 45 hours, she earns " + Student.calculatePay(45) + " dollars\n");
	}
}
