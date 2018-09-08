package lab5.prob4;

final class CustOrderImpl implements CustOrder {
	private Customer cust;
	private Order order;
	
	CustOrderImpl(Customer c, Order o) {
		cust = c;
		order = o;
	}
	
	public Customer getCustomer() {
		return cust;
	}
	
	public Order getOrder() {
		return order;
	}
}
