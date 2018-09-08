package lab2.prob2A_factory;

public class GradeReport {
	private String grade;
	private Student student;
	
	GradeReport() {
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return String.format("Grade: %s of student %s", this.grade, this.student.getName());
	}
	
}
