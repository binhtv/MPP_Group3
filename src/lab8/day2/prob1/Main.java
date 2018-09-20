package lab8.day2.prob1;

public class Main {
	public static void main(String... args) {
		MyClass mc = new MyClass();
		MyClass mc2 = new MyClass();
		System.out.println(mc.isEquals(mc2));
		System.out.println(mc.isEquals(mc));
	}
}
