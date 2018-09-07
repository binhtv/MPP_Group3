package prob1;

import prob1.behavior.FlyBehavior;
import prob1.behavior.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;	
	QuackBehavior quackBehavior;

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void swim() {
		System.out.println("   swimming");
	}
	
	public abstract void display();

}
