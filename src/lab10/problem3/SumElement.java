package lab10.problem3;

import java.util.Arrays;
import java.util.List;

public class SumElement {
	public static <T extends Number> double sum(List<T> elements) {
		double sum = 0;
		for (T e : elements) {
			sum += e.doubleValue();
		}
		return sum;
	}

	public static void main(String... strings) {
		System.out.println(sum(Arrays.asList(1, 2, 3, 4, 5, 6)));
		System.out.println(sum(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6)));
		System.out.println(sum(Arrays.asList(1, 2.6f, 3, 4L, 5.9, 6)));
	}
}
