package lab2.prob2A_factory;

public class StudentGradeReportFactory {
	public static Student createStudent(String name, String grade) {
		if(name == null) {
			throw new IllegalArgumentException("Student name can not be null");
		}
		Student student = new Student(name);
		
		//Create grade report
		GradeReport gradeReport = new GradeReport();
		gradeReport.setGrade(grade);
		gradeReport.setStudent(student);
		
		//Set grade report on student
		student.setGradeReport(gradeReport);
		
		return student;
	}
}
