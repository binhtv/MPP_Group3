package prob1;

import prob1.behavior.impl.FlyWithWings;
import prob1.behavior.impl.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("    display");
	}
}
