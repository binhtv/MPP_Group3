package lab4.partc;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public HourlyEmployee(int empId, double wage, double hours) {
		super(empId);
		this.hourlyWage = wage;
		this.hoursPerWeek = hours;
	}

	@Override
	protected double calcGrossPay(int month, int year) {
		//Assume that there are four weeks a month
		return hourlyWage * hoursPerWeek * 4;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

}
