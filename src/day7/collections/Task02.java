/*
 * Create a class product with the following fields pid, pname, pprice
 * Add 5 products with all the parameters
 * Display only those products whose price is < 200
 */

package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Product {
	int pId;
	String pName;
	float pPrice;

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}

	public Product(int pId, String pName, float pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
}

public class Task02 {
	public static void main(String[] args) {
		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product(1, "Product A", 99.99f));
		prod.add(new Product(2, "Product B", 100.99f));
		prod.add(new Product(3, "Product C", 250.99f));
		prod.add(new Product(4, "Product D", 249.99f));
		prod.add(new Product(5, "Product E", 100.0f));

		Iterator<Product> itr = prod.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if (p.pPrice < 200.0f) {
				System.out.println(p.pId + " " + p.pName + " " + p.pPrice);
			}
		}

	}
}