package lab8.day2.prob4;

import java.util.Arrays;

public class Main {
	public static void main(String... args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		System.err.println("Before sorting: ");
		for(String str : names) {
			System.out.println(str);
		}
		Arrays.sort(names, String::compareToIgnoreCase);
		System.err.println("After sorting: ");
		for(String str : names) {
			System.out.println(str);
		}
	}
}
