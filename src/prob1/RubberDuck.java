package prob1;

import prob1.behavior.impl.CannotFly;
import prob1.behavior.impl.Squeak;

public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}
	public void display() {
		System.out.println("    displaying");
	}

}
