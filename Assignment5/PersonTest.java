import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * The PersonTest class creates instances of Person and prints sorted lists
 *
 * @author Andy Luong
 * @since 2021-03-15
 */
public class PersonTest {
	public static void main(String[] args) {
		Person Smith = new Person("Joe", "Smith", 40);
		Person Gold = new Person("Amy", "Gold", 32);
		Person Stork = new Person("Tony", "Stork", 21);
		Person Irish = new Person("Sean", "Irish", 24);
		Person Brock = new Person("Tina", "Brock", 28);
		Person Hep = new Person("Lenny", "Hep", 18);
		
		
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(Smith);
		arr.add(Gold);
		arr.add(Stork);
		arr.add(Irish);
		arr.add(Brock);
		arr.add(Hep);
		
		/** Least to greatest age */
		System.out.println("Ascending age");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
			      return o1.getAge() - o2.getAge();
			   } });
		for(Person p : arr) {
			p.introduce();
		}
		
		/** Greatest to least age */
		System.out.println("\nDescending age");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
			      return o2.getAge() - o1.getAge();
			   } });
		for(Person p : arr) {
			p.introduce();
		}
		
		/** Least to greatest first name  */
		System.out.println("\nAscending first name");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
			      return o1.getFirstName().compareTo(o2.getFirstName());
			   } });
		for(Person p : arr) {
			p.introduce();
		}
		
		/** Greatest to least first name */
		System.out.println("\nDescending first name");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
				   return o2.getFirstName().compareTo(o1.getFirstName());
			   } });
		for(Person p : arr) {
			p.introduce();
		}
		
		/** Least to greatest last name length */
		System.out.println("\nAscending last name length");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
			      return o1.getLastName().length() - o2.getLastName().length();
			   } });
		for(Person p : arr) {
			p.introduce();
		}
		
		/** Greatest to least last name length */
		System.out.println("\nDescending last name length");
		Collections.sort(arr, new Comparator<Person>(){
			   public int compare(Person o1, Person o2){
			      return o2.getLastName().length() - o1.getLastName().length();
			   } });
		for(Person p : arr) {
			p.introduce();
		}
	}
}
