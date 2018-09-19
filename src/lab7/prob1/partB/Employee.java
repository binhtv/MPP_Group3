package lab7.prob1.partB;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	@Override
	public boolean equals(Object e) {
		if(e == null) {
			return false;
		}
		if(!(e instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) e;
		return employee.name.equals(name) && employee.salary == salary;
	}
}
