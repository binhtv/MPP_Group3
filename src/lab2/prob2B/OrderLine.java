package lab2.prob2B;

public class OrderLine {
	private String name;
	private Order order;
	
	public OrderLine(String name, Order order) {
		if(name == null || order == null) {
			throw new IllegalArgumentException("Order Line name and order cannot be null.");
		}
		
		this.name = name;
		this.order = order;
	}
	
	public String getName() {
		return name;
	}
	
	public Order getOrder() {
		return order;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
