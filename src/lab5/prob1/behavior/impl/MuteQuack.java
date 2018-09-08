package lab5.prob1.behavior.impl;

import lab5.prob1.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("    cannot quack");
	}

}
