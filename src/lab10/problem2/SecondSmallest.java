package lab10.problem2;

import java.util.Arrays;
import java.util.List;

public class SecondSmallest {
	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		if (list == null || list.size() == 0) {
			return null;
		}

		T smallest = list.get(0);
		T secondSmallest = list.get(0);
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
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(secondSmallest(list));
	}
}
