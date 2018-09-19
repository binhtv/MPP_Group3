package lab8.day2.prob1;

import java.util.Collections;
import java.util.List;

import lab8.day1.prob2.Product;

public class ProductInfoWithLambda {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	public void sort(List<Product> products, final SortMethod method) {
		Collections.sort(products, (p1, p2) -> {
			if (method == SortMethod.BYPRICE) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			} else if (method == SortMethod.BYTITLE) {// If titles are the same then sort by model
				int compareResult = p1.getTitle().compareToIgnoreCase(p2.getTitle());
				return compareResult == 0 ? Integer.compare(p1.getModel(), p2.getModel()) : compareResult;
			} else {
				throw new IllegalArgumentException("Cannot compare");
			}
		});
	}
}
