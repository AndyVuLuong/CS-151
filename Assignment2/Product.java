/**
 * @author Andy Luong
 * @version 1.0
 * @since 2021-02-07
 *
 * <h1>Product class program<h1>
 * <h2>Introduction</h2>
 * This program defines the final class Product
 * <p>
 * A product has a name, description, price, and maxQuantity
 * 
 */
public final class Product {
	private String name;
	private String description;
	private int price;
	private int maxQuantity;
	
	public Product(String name, String description, int price, int maxQuantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getMaxQuantity() {
		return maxQuantity;
	}
	
	public String toString() {
		return name + " is " + description; 
	}
}
