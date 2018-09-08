package lab2.prob2B.extpackage;

import lab2.prob2B.Order;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(1234);
		order.addItem("Item 1");
		order.addItem("Item 2");
		order.addItem("Item 3");
		System.out.println(order);
	}

}
