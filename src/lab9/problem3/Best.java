package lab9.problem3;

public class Best {
	final static MyFunctionInterface funcCountWords = (list, c, d, len) -> (int) list.stream().filter(
			word -> (word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d)) && word.length() == len))
			.count();
}
