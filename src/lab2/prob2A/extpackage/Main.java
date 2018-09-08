package lab2.prob2A.extpackage;

import lab2.prob2A.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Bob");
		student.getGradReport().setGrade("A");
		System.out.println(student);
		System.out.println(student.getGradReport());
	}

}
