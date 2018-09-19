package lab7.prob3;

public class RubberDuck extends Duck {
	@Override
	public void fly() {
		System.out.println("    cannot fly");
	}

	@Override
	public void quack() {
		System.out.println("    squeaking");
	}

	public void display() {
		System.out.println("    displaying");
	}

}
