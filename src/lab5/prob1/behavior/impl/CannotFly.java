package lab5.prob1.behavior.impl;

import lab5.prob1.behavior.FlyBehavior;

public class CannotFly implements FlyBehavior {

	public void fly() {
		System.out.println("    cannot fly");
	}

}
