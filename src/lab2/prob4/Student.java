package lab2.prob4;

import java.util.*;

public class Student {
	String id;
	String name;
	public List<TranscriptEntry> grades;

	public List<String> getCourseNames() {
		List<TranscriptEntry> all = grades;
		List<String> courseNames = new ArrayList<>();
		for (TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}

	public void createListGrades() {
		if (grades == null) {
			this.grades = new ArrayList<TranscriptEntry>();
		}
	}

	public Transcript getTranscript() {
		return new Transcript(grades, this);
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
