/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Animal output program<h1>
 * <h2>Introduction</h2>
 * This is a program that will use Animal.java, Dog.java, Cat.java, Racoon.java, Whale.java,
 * Domesticated.java, Scratcher.java, and Swimmer.java to
 * test the output of when a object with Animal as its parent is instantiated.
 * <h2>Compile instructions</h2>
 * Compile by running the following command:
 * <i>javac AnimalTest.java</i>
 * <h2>Execute instructions</h2>
 * Execute by running the following command:
 * <i>java AnimalTest</i>
 * <p>
 * This program will output the details of 4 animals
 * 
 */
public class AnimalTest {
	public static void main(String args[]) {
		Dog dog = new Dog("dog", "Spot", 10, "male", "home", 5);
		System.out.println(dog.toString() + "\nThis animal can do the following:");
		dog.move();
		dog.sound();
		dog.eat();
		dog.sleep();
		dog.walk();
		dog.greetHuman();
		dog.bark();
		System.out.println();
		
		Cat cat = new Cat("cat", "Garfield", 5, "female", "home", 1);
		System.out.println(cat.toString() + "\nThis animal can do the following:");
		cat.move();
		cat.sound();
		cat.eat();
		cat.sleep();
		cat.walk();
		cat.greetHuman();
		cat.scratch();
		System.out.println();
		
		Racoon racoon = new Racoon("racoon", "Chopper", 7, "male", "forest", 3);
		System.out.println(racoon.toString() + "\nThis animal can do the following:");
		racoon.move();
		racoon.sound();
		racoon.eat();
		racoon.sleep();
		racoon.scratch();
		System.out.println();
		
		Whale whale = new Whale("whale", "Moby Dick", 30, "female", "ocean", 30);
		System.out.println(whale.toString() + "\nThis animal can do the following:");
		whale.move();
		whale.sound();
		whale.eat();
		whale.sleep();
		whale.swim();
	}
}