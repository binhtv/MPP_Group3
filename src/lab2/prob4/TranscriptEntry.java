package lab2.prob4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;

	public String toString() {
		return "Student: " + student.getName() + "\n" + "Course name: " + section.courseName + "\n" + "Section number: "
				+ section.sectionNumber + "\n" + "Grade: " + grade + "\n";
	}
}
