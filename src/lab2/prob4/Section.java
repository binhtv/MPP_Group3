package lab2.prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	public List<TranscriptEntry> gradeSheet;

	public void addGradesSheet(TranscriptEntry grades) {
		if (gradeSheet == null)
			gradeSheet = new ArrayList<TranscriptEntry>();
		gradeSheet.add(grades);
	}

	public List<String> getGrades() {
		List<String> grades = new ArrayList<>();
		for (TranscriptEntry t : gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
}
