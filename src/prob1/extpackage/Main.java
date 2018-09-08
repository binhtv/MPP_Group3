package prob1.extpackage;

import prob1.DecoyDuck;
import prob1.Duck;
import prob1.MallardDuck;
import prob1.RedheadDuck;
import prob1.RubberDuck;

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
