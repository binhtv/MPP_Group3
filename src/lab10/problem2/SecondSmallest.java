package lab10.problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SecondSmallest {
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		if (list == null || list.size() <= 1) {
			return null;
		}
		T smallest = list.stream().max(T::compareTo).get();
		T secondSmallest = smallest;
		for (T t : list) {
			if (t.compareTo(smallest) < 0) {
				secondSmallest = smallest;
				smallest = t;
			} else if (t.compareTo(secondSmallest) < 0 && !t.equals(smallest)) {
				secondSmallest = t;
			}
		}

		return secondSmallest;
	}

	public static void main(String... strings) {
		List<Integer> ints = Arrays.asList(1, 1, 2, 5, 9, 3, 4, 7, 6);
		List<LocalDate> dates = Arrays.asList(LocalDate.of(2018, 9, 12), LocalDate.of(2018, 10, 13),
				LocalDate.of(2018, 8, 15));
		List<Double> doubles = Arrays.asList(5.0, 9.5, 3.5, 78.3, 100.1);
		List<Long> longs = Arrays.asList(10L, -5L, 11L, -3L);
		System.out.println("List of intergers: ");
		System.out.println(ints);
		System.out.println("Second smallest: " + secondSmallest(ints));

		System.out.println();
		System.out.println("List of LocalDate: ");
		System.out.println(dates);
		System.out.println("Second smallest: " + secondSmallest(dates));

		System.out.println();
		System.out.println("List of Double: ");
		System.out.println(doubles);
		System.out.println("Second smallest: " + secondSmallest(doubles));

		System.out.println();
		System.out.println("List of Long: ");
		System.out.println(longs);
		System.out.println("Second smallest: " + secondSmallest(longs));
	}
}
