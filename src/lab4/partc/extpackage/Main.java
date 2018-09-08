package lab4.partc.extpackage;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import lab4.partc.CommissionedEmployee;
import lab4.partc.Employee;
import lab4.partc.HourlyEmployee;
import lab4.partc.Order;
import lab4.partc.SalariedEmployee;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new HourlyEmployee(123, 15, 38));
		employees.add(new HourlyEmployee(124, 18, 30));
		employees.add(new HourlyEmployee(125, 20, 40));
		employees.add(new HourlyEmployee(126, 35, 15));

		employees.add(new SalariedEmployee(220, 4500));
		employees.add(new SalariedEmployee(221, 3500));
		employees.add(new SalariedEmployee(222, 5500));
		employees.add(new SalariedEmployee(223, 6600));
		employees.add(new SalariedEmployee(224, 6000));
		employees.add(new SalariedEmployee(225, 2000));
		employees.add(new SalariedEmployee(226, 10000));

		ThreadLocalRandom random = ThreadLocalRandom.current();
		CommissionedEmployee ce = new CommissionedEmployee(330, 1500, 0.05);
		List<Order> orders = new ArrayList<>();
		for (int i = 1; i < 12; i++) {
			orders.addAll(generateOrders(i, 2017, random.nextInt(10, 100)));
			orders.addAll(generateOrders(i, 2018, random.nextInt(10, 100)));
		}
		ce.setOrders(orders);
		CommissionedEmployee ce1 = new CommissionedEmployee(331, 1000, 0.08);
		orders.clear();
		for (int i = 1; i < 12; i++) {
			orders.addAll(generateOrders(i, 2017, random.nextInt(10, 100)));
			orders.addAll(generateOrders(i, 2018, random.nextInt(10, 100)));
		}
		ce1.setOrders(orders);
		CommissionedEmployee ce2 = new CommissionedEmployee(332, 1300, 0.09);
		orders.clear();
		for (int i = 1; i < 12; i++) {
			orders.addAll(generateOrders(i, 2017, random.nextInt(10, 100)));
			orders.addAll(generateOrders(i, 2018, random.nextInt(10, 100)));
		}
		ce2.setOrders(orders);

		employees.add(ce);
		employees.add(ce1);
		employees.add(ce2);

		for (Employee e : employees) {
			e.print(1, 2018);
			System.out.println();
			e.print(2, 2017);
			System.out.println();
			e.print(5, 2016);
			System.out.println();
		}
	}

	private static List<Order> generateOrders(int month, int year, int count) {
		List<Order> orders = new ArrayList<>();
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int orderId = random.nextInt(1000, 99999);
		for (int i = 0; i < count; i++) {
			try {
				orders.add(new Order(orderId + i, LocalDate.of(year, month, random.nextInt(1, 31)),
						random.nextDouble(10, 2000)));
			} catch (DateTimeException exc) {
				
			}
		}

		return orders;
	}
}
