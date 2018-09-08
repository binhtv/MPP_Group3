package lab5.prob1;

import lab5.prob1.behavior.impl.FlyWithWings;
import lab5.prob1.behavior.impl.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("    display");
	}
}
