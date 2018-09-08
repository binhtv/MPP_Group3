package lab3.prob3.extpackage;

import lab3.prob3.Circle;
import lab3.prob3.Cylinder;

public class Main {
	public static final void main(String...strings) {
		Circle circle = new Circle(10.5);
		Cylinder cylinder = new Cylinder(20, circle);
		System.out.println("Circle area: " + circle.computeArea());
		System.out.println("Cylinder volume: " + cylinder.computeVolume());
	}
}
