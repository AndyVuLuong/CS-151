/**
 * @author Andy Luong
 * @since 2/24/2021
 * 
 * 2 Instances of each class with setting SSN, Age, Education, Direct Deposit, and Pay Preference with given hours or weeks
 */
public class BusinessTest {
	
	public static void main(String args[]) {
		Address address = new Address(1954, "Tia Place", "San Jose", "95131", "California");
		Address address2 = new Address(2000, "Wakanda Street", "Guana", "20000", "Africa");
		Address address3 = new Address(3000, "Chun Road", "Hong Kong", "30000", "China");
		Address address4 = new Address(4000, "Mafia Suite", "Mexico City", "40000", "Mexico");
		Address address5 = new Address(5000, "Liberty Avenue", "New York", "50000", "New York");
		Address address6 = new Address(6000, "Wildfire Gate", "Melbourne", "60000", "Australia");
		Address address7 = new Address(7000, "Crsip Way", "London", "70000", "United Kingdom");
		Address address8 = new Address(8000, "Stadium Circle", "San Antonio", "80000", "Texas");
		Address address9 = new Address(9000, "Champ Road", "West Newbury", "90000", "Massachusetts");
		Address address10 = new Address(1010, "Charity Intersection", "Seattle", "10101", "Washington");
		Address address11 = new Address(1111, "Lover Highway", "West Reading", "11111", "Pennsylvania");
		Address address12 = new Address(1212, "Best Expressway", "Tokyo", "12121", "Japan");
		
		Executive executive = new Executive("Andy","Luong", address, 1, 10000.0, 500.0);
		executive.setSSN("111-11-1111");
		executive.setAge(20);
		executive.setEducation("Master's Degree");
		executive.setDirectDeposit(true);
		
		Executive executive2 = new Executive("Max","Payne", address2, 2, 20000.0, 500.0);
		executive2.setSSN("222-22-2222");
		executive2.setAge(16);
		executive2.setEducation("High School Degree");
		executive2.setDirectDeposit(false);
		
		FullTimeSalaried fullTimeSalaried = new FullTimeSalaried("Sophine","Tran", address3, 3, 30.0);
		fullTimeSalaried.setSSN("333-33-3333");
		fullTimeSalaried.setAge(17);
		fullTimeSalaried.setEducation("Professional Degree");
		fullTimeSalaried.setDirectDeposit(true);
		
		FullTimeSalaried fullTimeSalaried2 = new FullTimeSalaried("Zack","Lionhart", address4, 4, 45.0);
		fullTimeSalaried2.setSSN("444-44-4444");
		fullTimeSalaried2.setAge(17);
		fullTimeSalaried2.setEducation("Master's Degree");
		fullTimeSalaried2.setDirectDeposit(true);
		
		FullTimeHourly fullTimeHourly = new FullTimeHourly("Isabella","Misor", address5, 5, 45.0, 10.0);
		fullTimeHourly.setSSN("555-55-5555");
		fullTimeHourly.setAge(18);
		fullTimeHourly.setEducation("Master's Degree");
		fullTimeHourly.setDirectDeposit(false);
		
		FullTimeHourly fullTimeHourly2 = new FullTimeHourly("Leila","Kay", address6, 6, 30.0, 20.0);
		fullTimeHourly2.setSSN("666-66-6666");
		fullTimeHourly2.setAge(15);
		fullTimeHourly2.setEducation("Associate's Degree");
		fullTimeHourly2.setDirectDeposit(true);
		
		PartTimeHourly partTimeHourly = new PartTimeHourly("Sebastian","Davis", address7, 7, 20.0);
		partTimeHourly.setSSN("777-77-7777");
		partTimeHourly.setAge(19);
		partTimeHourly.setEducation("Doctoral Degree");
		partTimeHourly.setDirectDeposit(false);
		
		PartTimeHourly partTimeHourly2 = new PartTimeHourly("John","Smith", address8, 8, 15.4);
		partTimeHourly2.setSSN("888-88-8888");
		partTimeHourly2.setAge(30);
		partTimeHourly2.setEducation("None");
		partTimeHourly2.setDirectDeposit(true);
		
		Contractor contractor = new Contractor("John","Cena", address9, 9, 100.0);
		contractor.setSSN("999-99-9999");
		contractor.setAge(43);
		contractor.setEducation("Wreslting");
		contractor.setDirectDeposit(false);
		
		Contractor contractor2 = new Contractor("Bill","Gates", address10, 10, 1000.0);
		contractor2.setSSN("100-00-0000");
		contractor2.setAge(65);
		contractor2.setEducation("College drop out");
		contractor2.setDirectDeposit(true);
		
		Customer customer = new Customer("Taylor","Swift", address11, 11);
		customer.setSSN("123-45-6789");
		customer.setAge(31);
		customer.setPayPreference("Card");
		
		Customer customer2 = new Customer("Kosaki","Onodera", address12, 12);
		customer2.setSSN("987-65-4321");
		customer2.setAge(14);
		customer2.setPayPreference("Cash");
		
		System.out.println("Executive");
		executive.introduce(true);
		System.out.println("Pay after bonus " + executive.computePay());
		System.out.println("");
		
		System.out.println("Executive");
		executive2.introduce(false);
		System.out.println("Pay after bonus " + executive2.computePay());
		System.out.println("");
		
		System.out.println("Full Time Salaried");
		fullTimeSalaried.introduce(true);
		int weeks = 1;
		System.out.println("Pay after " + weeks + " weeks: " + fullTimeSalaried.computePay(1));
		System.out.println("");
		
		System.out.println("Full Time Salaried");
		fullTimeSalaried2.introduce(false);
		int weeks2 = 2;
		System.out.println("Pay after " + weeks2 + " weeks: " + fullTimeSalaried2.computePay(2));
		System.out.println("");
		
		System.out.println("Full Time Hourly");
		fullTimeHourly.introduce(true);
		int hours = 3;
		System.out.println("Pay after " + hours + " hours: " + fullTimeHourly.computePay(hours));
		System.out.println("");
		
		System.out.println("Full Time Hourly");
		fullTimeHourly2.introduce(false);
		int hours2 = 4;
		System.out.println("Pay after " + hours2 + " hours: " + fullTimeHourly2.computePay(hours2));
		System.out.println("");
		
		System.out.println("Part Time Hourly");
		partTimeHourly.introduce(true);
		int hours3 = 5;
		System.out.println("Pay after " + hours3 + " hours: " + partTimeHourly.computePay(hours3));
		System.out.println("");
		
		System.out.println("Part Time Hourly");
		partTimeHourly2.introduce(false);
		int hours4 = 6;
		System.out.println("Pay after " + hours4 + " hours: " + partTimeHourly2.computePay(hours4));
		System.out.println("");
		
		System.out.println("Contractor");
		contractor.introduce(true);
		int hours5 = 7;
		System.out.println("Pay after " + hours5 + " hours: " + contractor.computePay(hours5));
		System.out.println("");
		
		System.out.println("Contractor");
		contractor2.introduce(false);
		int hours6 = 8;
		System.out.println("Pay after " + hours6 + " hours: " + contractor2.computePay(hours6));
		System.out.println("");
		
		System.out.println("Customer");
		customer.introduce();
		customer.makePayment();
		System.out.println("");
		
		System.out.println("Customer");
		customer2.introduce();
		customer2.makePayment();
	}
}