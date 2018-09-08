package lab5.prob4.extpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lab5.prob4.CustOrder;
import lab5.prob4.CustOrderFactory;
import lab5.prob4.Customer;

public class Main {
	public static void main(String[] args) {
		/*
		 * Customer cust = new Customer("Bob"); Order order =
		 * Order.newOrder(cust, LocalDate.now()); order.addItem("Shirt");
		 * order.addItem("Laptop");
		 * 
		 * order = Order.newOrder(cust, LocalDate.now());
		 * order.addItem("Pants"); order.addItem("Knife set");
		 */

		CustOrder custorder;
		List<Customer> custList = new ArrayList<>();

		List<String> itemList = new ArrayList<String>();
		itemList.add("Shirt");
		itemList.add("Laptop");
		custorder = CustOrderFactory.createCustAndOrder("Bob", LocalDate.now(), itemList);
		custList.add(custorder.getCustomer());

		itemList.clear();
		itemList.add("Pants");
		itemList.add("Knife set");
		custorder = CustOrderFactory.createCustAndOrder("Bob", LocalDate.now(), itemList);
		custList.add(custorder.getCustomer());

		for (Customer c : custList)
			System.out.println(c.getOrders());
	}
}
