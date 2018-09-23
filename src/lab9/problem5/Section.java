package lab9.problem5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public Stream<String> streamSection(Stream<String> stream, int m, int n) {
		if (stream == null || m < 0 || m > n) {
			throw new IllegalArgumentException("Illegal arugments");
		}
		return stream.skip(m).limit(n - m + 1);
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

	public static void main(String... strings) {
		Section sec = new Section();
		System.out.println("Original stream: ");
		System.out.println(nextStream().reduce((x, y) -> x + " " + y).orElse(""));
		System.out.println("Section from 0 -> 1: ");
		System.out.println(sec.streamSection(nextStream(), 0, 1).reduce((x, y) -> x + " " + y).orElse(""));
		System.out.println("Section from 2 -> 4: ");
		System.out.println(sec.streamSection(nextStream(), 2, 4).reduce((x, y) -> x + " " + y).orElse(""));
	}
}
