package lab9.problem7.b;

import java.util.List;

import lab9.problem7.a.Employee;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Double, Character, String> QUERY = (employees, salary, c) -> employees.stream()
					.filter(e -> e.getSalary() > salary && (e.getLastName().charAt(0) > 'M') && (e.getLastName().charAt(0) <= 'Z'))
					.map(Employee::getFullName).sorted().reduce((name1, name2) -> name1 + ", " + name2)
					.orElse("No employees found.");
}
