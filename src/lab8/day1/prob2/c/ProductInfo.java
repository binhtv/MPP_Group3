package lab8.day1.prob2.c;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lab8.day1.prob2.Product;

public class ProductInfo {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	public void sort(List<Product> products, final SortMethod method) {
		class TitleOrPriceComparator implements Comparator<Product> {

			@Override
			public int compare(Product p1, Product p2) {
				if(method == SortMethod.BYPRICE) {
					return Double.compare(p1.getPrice(), p2.getPrice());
				} else if(method == SortMethod.BYTITLE){
					return p1.getTitle().compareToIgnoreCase(p2.getTitle());
				} else {
					throw new IllegalArgumentException("Cannot compare");
				}
			}

		}

		Collections.sort(products, new TitleOrPriceComparator());
	}
}
