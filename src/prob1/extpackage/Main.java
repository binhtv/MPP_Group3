package prob1.extpackage;

import prob1.Duck;
import prob1.MallardDuck;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck()};
		
		for(Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName()+":");
			d.display();
			d.getFlyBehavior().fly();
			d.getQuackBehavior().quack();
			d.swim();
		}
	}

}
