package lab8.day1.prob2.ab;

import java.util.Comparator;

import lab8.day1.prob2.Product;

public class TitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getTitle().compareToIgnoreCase(p2.getTitle());
	}

}
