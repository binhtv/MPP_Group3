package lab9.problem2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String... strings) {
		Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		IntSummaryStatistics iss = myIntStream.collect(Collectors.summarizingInt(Integer::valueOf));
		System.out.println("Maximum value: " + iss.getMax());
		System.out.println("Minimum value: " + iss.getMin());
	}
}
