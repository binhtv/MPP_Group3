package lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String... args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

		// A. Print the given list using forEach with Lambdas
		fruits.forEach(f -> System.out.println(f));
		System.out.println("------");
		// B. Print the given list using method reference
		fruits.forEach(System.out::println);
	}
}
