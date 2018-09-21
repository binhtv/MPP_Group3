package lab8.day2.prob1;

public class Main {
	public static void main(String... args) {
		MyClass mc = new MyClass(1, 2);
		MyClass mc2 = new MyClass(3, 4);
		MyClass mc3 = new MyClass(3, 4);
		System.out.println("mc is equals to mc: " + mc.isEquals(mc));
		System.out.println("mc is equals to mc2: " + mc.isEquals(mc2));
		System.out.println("mc2 is equals to mc3: " + mc2.isEquals(mc3));
		System.out.println("mc3 is equals to mc2: " + mc3.isEquals(mc2));
	}
}
