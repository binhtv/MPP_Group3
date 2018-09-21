package lab9.problem4;

import java.util.stream.IntStream;

public class MyPrintSquare {
	public static void printSquares(int num) {
		IntStream streams = IntStream.iterate(1, n -> n + 1).limit(num);
		StringBuilder sb = streams.map(n -> n * n).collect(StringBuilder::new, (sb1, n) -> sb1.append(", ").append(n),
				StringBuilder::append);
		//Remove the "," at the beginning
		System.out.println(sb.delete(0, 2));
	}
}
