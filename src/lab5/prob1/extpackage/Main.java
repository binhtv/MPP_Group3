package lab5.prob1.extpackage;

import lab5.prob1.DecoyDuck;
import lab5.prob1.Duck;
import lab5.prob1.MallardDuck;
import lab5.prob1.RedheadDuck;
import lab5.prob1.RubberDuck;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		
		for(Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName()+":");
			d.display();
			d.getFlyBehavior().fly();
			d.getQuackBehavior().quack();
			d.swim();
		}
	}

}
