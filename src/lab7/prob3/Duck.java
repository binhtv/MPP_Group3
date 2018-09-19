package lab7.prob3;

public abstract class Duck implements Flyable, Quackable {
	
	public void swim() {
		System.out.println("    swimming");
	}
	
	public abstract void display();

}
