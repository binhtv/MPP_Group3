package lab5.prob1;

import lab5.prob1.behavior.impl.CannotFly;
import lab5.prob1.behavior.impl.Squeak;

public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}
	public void display() {
		System.out.println("    displaying");
	}

}
