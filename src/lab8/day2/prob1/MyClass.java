package lab8.day2.prob1;

import java.util.function.Function;

public class MyClass {
	public boolean isEquals(MyClass cl) {
		Function<MyClass, Boolean> func = this::equals;
		return func.apply(cl);
	}
}
