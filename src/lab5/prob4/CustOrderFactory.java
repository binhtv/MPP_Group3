package lab5.prob4;

import java.time.LocalDate;
import java.util.List;

final public class CustOrderFactory {
	private CustOrderFactory() {
	}

	public static CustOrder createCustAndOrder(String name, LocalDate orderDate, List<String> itemList) {
		Customer cust = new Customer(name);
		Order order = Order.newOrder(cust, orderDate);
		for (String item : itemList)
			order.addItem(item);
		return new CustOrderImpl(cust, order);
	}
}
