package lab9.problem1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String... strings) {
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.joining(", ")));
	}
}
