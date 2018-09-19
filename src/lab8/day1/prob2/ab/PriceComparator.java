package lab8.day1.prob2.ab;

import java.util.Comparator;

import lab8.day1.prob2.Product;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}

}
