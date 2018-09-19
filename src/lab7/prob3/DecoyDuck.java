package lab7.prob3;

public class DecoyDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("    cannot fly");
	}
	
	@Override
	public void quack() {
		System.out.println("    cannot quack");
	}
	
	public void display() {
		System.out.println("    displaying");
	}

}
