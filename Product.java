package Lists;
import java.util.*;

public class Product {
	private String name;
	private int units;
	private double price;
	private String supermarket;
	public Product(String name, int units, double price, String supermarket) {
		this.name = name;
		this.units = units;
		this.price = price;
		this.supermarket = supermarket;
	}
	public String getName() {
		return name;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getPrice() {
		return price;
	}
	public String getSupermarket() {
		return supermarket;
	}
	public String toString() {
		return "Product [name=" + name + ", units=" + units + ", price=" + price + ", supermarket=" + supermarket + "]";
	}
	
	
}
