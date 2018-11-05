package Lists;
import java.util.*;

public class List {
	private Product product;
	Set<Product> shoppingList= new HashSet<Product>();
	
	public List (Product product) {
		this.product=product;
	}
	public Set<Product> insertProduct (Product product) {
		shoppingList.add(product);
		return shoppingList;
	}
	
}
