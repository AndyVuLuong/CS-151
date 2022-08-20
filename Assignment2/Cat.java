/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Cat class program<h1>
 * <h2>Introduction</h2>
 * This program defines the subclass Cat
 * <p>
 * A cat is animal that can also walk, greet a human, and scratch
 * 
 */
public class Cat extends Animal implements Domesticated, Scratcher{
	public Cat(String type, String name, int age, String gender, String environment, double speed) {
		super(type, name, age, gender, environment, speed);
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void greetHuman() {
		System.out.println("Greeting Human");
	}
	public void scratch() {
		System.out.println("Scratching");
	}
}
