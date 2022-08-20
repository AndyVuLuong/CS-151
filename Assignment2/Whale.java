/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Whale class program<h1>
 * <h2>Introduction</h2>
 * This program defines the subclass Whale
 * <p>
 * A whale is an animal that can also swim
 * 
 */
public class Whale extends Animal implements Swimmer{
	public Whale(String type, String name, int age, String gender, String environment, double speed) {
		super(type, name, age, gender, environment, speed);
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
}
