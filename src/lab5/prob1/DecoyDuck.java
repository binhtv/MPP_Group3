package lab5.prob1;

import lab5.prob1.behavior.impl.CannotFly;
import lab5.prob1.behavior.impl.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}
	public void display() {
		System.out.println("    displaying");
	}

}
