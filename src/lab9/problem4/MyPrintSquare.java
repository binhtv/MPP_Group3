package lab9.problem4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyPrintSquare {
	public static void printSquares(int num) {
		IntStream streams = IntStream.iterate(1, n -> n + 1).limit(num);
		System.out.println(streams.map(n -> n * n).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(", ")));
	}
}
