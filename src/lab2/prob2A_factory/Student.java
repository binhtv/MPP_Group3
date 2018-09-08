package lab2.prob2A_factory;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	Student(String name) {
		this.name = name;
		gradeReport = new GradeReport();
	}

	public String getName() {
		return name;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}
	
	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
	@Override
	public String toString() {
		return String.format("Student: %s has grade %s", this.name, this.gradeReport.getGrade());
	}
}
