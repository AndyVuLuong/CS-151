/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Racoon class program<h1>
 * <h2>Introduction</h2>
 * This program defines the subclass Racoon
 * <p>
 * A racoon is a animal that can also scratch
 * 
 */
public class Racoon extends Animal implements Scratcher{
	public Racoon(String type, String name, int age, String gender, String environment, double speed) {
		super(type, name, age, gender, environment, speed);
	}

	public void scratch() {
		System.out.println("Scratching");
	}
}
