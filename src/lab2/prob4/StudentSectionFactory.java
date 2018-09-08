/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.prob4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VanThao
 */
public class StudentSectionFactory {

	public StudentSectionFactory() {
	}

	public Section createSection(int secNum, String courseName) {
		Section section = new Section();
		section.courseName = courseName;
		section.sectionNumber = secNum;
		return section;
	}

	public Student createStudent(String id, String name) {
		Student student = new Student();
		student.id = id;
		student.name = name;
		return student;
	}

	public void newTranscriptEntry(Student s, Section sect, String grade) {
		s.createListGrades();
		TranscriptEntry t = new TranscriptEntry();
		t.grade = grade;
		t.section = sect;
		t.student = s;
		s.grades.add(t);
		sect.addGradesSheet(t);
	}
	
	public List<Student> getStudentsWith(List<Student> students, String grade) {
		List<Student> gradeStudents = new ArrayList<>();
		for(Student student : students) {
			for(TranscriptEntry te : student.grades) {
				if(grade.equals(te.grade)) {
					gradeStudents.add(student);
				}
			}
		}
		
		return gradeStudents;
	}
}
