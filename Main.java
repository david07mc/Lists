package Lists;
import java.util.*;

public class Main implements Supermarket {
	static char pname;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the product you desire to add");
		pname=sc.next().charAt(0);
		sc.close();
	}
	
	public Product searchProduct (char pname) {
		boolean a = false; //this variable is used to go trough the Ahorroski supermarket for loop
		int i=0;
		Product product=null;
		while (i<Supermarket.stockAhorroski.length && a==false) {
			a=Supermarket.stockAhorroski[i][0].equals(pname);
			if (a==false) {
				i++;
			}
		}
		product=comparePrices(i);
		return product;
	}
	
	public Product comparePrices(int i) {
		double priceAhorroski = Double.parseDouble(Supermarket.stockAhorroski[i][1]);
		double priceLafleur = Double.parseDouble(Supermarket.stockLafleur[i][1]);
		Product product=null;
		if (priceAhorroski>priceLafleur) {
			product = new Product(Supermarket.stockLafleur[i][0],1,priceLafleur,"Lafleur");
		}else {
			product = new Product(Supermarket.stockAhorroski[i][0],1,priceAhorroski,"Ahorroski");
		}
		return product;
	}
}
