package lab4.partc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public CommissionedEmployee(int empId, double baseSalary, double commission) {
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
		this.orders = new ArrayList<>();
	}

	@Override
	protected double calcGrossPay(int month, int year) {
		double totalOrderAmount = 0;
		for (Order order : orders) {
			// Get the order amount for the previous month only
			LocalDate orderDate = order.getOrderDate();
			if (orderDate.getMonthValue() == month && orderDate.getYear() == year) {
				totalOrderAmount += order.getOrderAmount();
			}
		}

		return baseSalary + (totalOrderAmount * commission);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
