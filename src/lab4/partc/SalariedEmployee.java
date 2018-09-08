package lab4.partc;

public class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	protected double calcGrossPay(int month, int year) {
		return getSalary();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
