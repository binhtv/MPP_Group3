package prob1;

import prob1.behavior.impl.FlyWithWings;
import prob1.behavior.impl.Quack;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("    displaying");
	}

}
