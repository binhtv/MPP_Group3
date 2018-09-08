package lab5.prob2.extpackage;

import lab5.prob2.Circle;
import lab5.prob2.Figure;
import lab5.prob2.Rectangle;
import lab5.prob2.Triangle;

public class Main {

	public static void main(String[] args) {
		Figure[] figures = { new Rectangle(10, 20), new Triangle(20, 30), new Circle(15) };
		double sum = 0;
		for (Figure f : figures) {
			sum += f.computeArea();
		}
		System.out.println("Sum of Areas = " + String.valueOf(sum));
	}

}
