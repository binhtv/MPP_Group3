package lab8.day2.prob2;

import java.util.function.Supplier;

public class ProblemI {
	public static void main(String... args) {
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
	}
}
