package lab8.day2.prob2;

import java.util.function.Supplier;

public class ProblemIII {
	static class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}

	}

	public static void main(String... strings) {
		MySupplier ms = new MySupplier();
		System.out.println(ms.get());
	}
}
