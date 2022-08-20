/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Dog class program<h1>
 * <h2>Introduction</h2>
 * This program defines the subclass Dog
 * <p>
 * A dog is an animal that can also walk, greet a human, and bark
 * 
 */
public class Dog extends Animal implements Domesticated{
	public Dog(String type, String name, int age, String gender, String environment, double speed) {
		super(type, name, age, gender, environment, speed);
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void greetHuman() {
		System.out.println("Greeting Human");
	}
	public void bark() {
		System.out.println("Barking");
	}
}
