/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.prob4.extpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lab2.prob4.Section;
import lab2.prob4.Student;
import lab2.prob4.StudentSectionFactory;

/**
 *
 * @author VanThao
 */
public class Main {
	Student bob;
	Student tim;
	Student allen;
	List<Student> students = new ArrayList<>();
	Section bio1;
	Section bio2;
	Section math;
	StudentSectionFactory factory = new StudentSectionFactory();

	public static void main(String[] args) {
		Main m = new Main();
		m.readDataFromDb();
		for (Student student : m.students) {
			System.out.println(student.getTranscript());
		}
		System.out.println("-------------------------------");
		System.out.println("Grades for Math section: " + m.math.getGrades());
		System.out.println("Grades for Bio1 section: " + m.bio1.getGrades());
		System.out.println("Grades for Bio2 section: " + m.bio2.getGrades());
		System.out.println("-------------------------------");
		for (Student student : m.students) {
			System.out.println("Courses that " + student.getName() + " took: " + student.getCourseNames());
		}
		System.out.println("-------------------------------");
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}

	private List<Student> getStudentsWith(String grade) {
		return factory.getStudentsWith(students, grade);
	}

	private void readDataFromDb() {
		bob = factory.createStudent("1", "Bob");
		tim = factory.createStudent("2", "Tim");
		allen = factory.createStudent("3", "Allen");

		students.addAll(Arrays.asList(bob, tim, allen));

		bio1 = factory.createSection(1, "Biology");
		bio2 = factory.createSection(2, "Biology");
		math = factory.createSection(3, "Mathematics");
		factory.newTranscriptEntry(bob, bio1, "A");
		factory.newTranscriptEntry(bob, math, "B");
		factory.newTranscriptEntry(tim, bio1, "B+");
		factory.newTranscriptEntry(tim, math, "A-");
		factory.newTranscriptEntry(allen, math, "B");
		factory.newTranscriptEntry(allen, bio2, "B+");
	}
}
