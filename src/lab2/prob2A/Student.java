package lab2.prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	public Student (String name) {
		this.name = name;
		gradeReport = new GradeReport(this);
	}
	public String getName() {
		return name;
	}
	public GradeReport getGradReport() {
		return gradeReport;
	}
	
	@Override
	public String toString() {
		return String.format("Student: %s has grade %s", this.name, this.gradeReport.getGrade());
	}
}
