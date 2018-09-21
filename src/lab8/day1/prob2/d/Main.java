package lab8.day1.prob2.d;

import java.util.ArrayList;
import java.util.List;

import lab8.day1.prob2.Product;

/**
 * 
 * @author binhtran
 *
 */
public class Main {
	public static void main(String... args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Iphone XS", 1200.0, 2018));
		products.add(new Product("Iphone XS", 1400.0, 2013));
		products.add(new Product("Samsung Galaxy S9", 1200.0, 2019));
		products.add(new Product("Xiaomi", 750.0, 2018));
		products.add(new Product("Xiaomi", 750.0, 2015));
		products.add(new Product("LG E900", 1400.0, 2017));

		System.err.println("Before sorting");
		System.out.println(products);

		ProductInfoWithLambda pi = new ProductInfoWithLambda();
		pi.sort(products, ProductInfoWithLambda.SortMethod.BYPRICE);
		System.err.println("After sorting by price");
		System.out.println(products);

		pi.sort(products, ProductInfoWithLambda.SortMethod.BYTITLE);
		System.err.println("After sorting by title then model");
		System.out.println(products);
	}
}
