package lab2.prob2A_factory.extpackage;

import lab2.prob2A_factory.Student;
import lab2.prob2A_factory.StudentGradeReportFactory;

public class Main {

	public static void main(String[] args) {
		Student student = StudentGradeReportFactory.createStudent("Bob", "A");
		System.out.println(student);
		System.out.println(student.getGradeReport());
	}

}
