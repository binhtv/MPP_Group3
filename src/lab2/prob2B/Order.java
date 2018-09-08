package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderlines;
	
	public Order(int number) {
		orderNum = number;
		orderlines = new ArrayList<OrderLine>();
	}
	
	public void addItem(String name) {
		orderlines.add(new OrderLine(name, this));
	}
	
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	
	@Override
	public String toString() {
		return orderlines.toString();
	}
}
