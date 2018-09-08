package lab4.partc;

public abstract class Employee {
	private int empId;

	public Employee(int empId) {
		this.empId = empId;
	}

	public void print(int month, int year) {
		System.out.println(String.format("Pay Check for employee ID %s on %s/%s", empId, month, year));
		calculateCompensation(month, year).print();
	}

	public Paycheck calculateCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		double fica = grossPay * TaxPercentage.FICA.getValue();
		double state = grossPay * TaxPercentage.STATE.getValue();
		double local = grossPay * TaxPercentage.LOCAL.getValue();
		double medicare = grossPay * TaxPercentage.MEDICARE.getValue();
		double ss = grossPay * TaxPercentage.SOCIAL_SECURITY.getValue();
		return new Paycheck(grossPay, fica, state, local, medicare, ss);
	}

	protected abstract double calcGrossPay(int month, int year);

	public int getEmpId() {
		return empId;
	}
}
