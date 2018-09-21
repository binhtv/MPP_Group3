package lab9.problem3;

import java.util.List;

/**
 * 
 * @author binhtran
 *
 */
public class Good {
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(name -> name.contains("" + c) && !name.contains("" + d) && name.length() == len)
				.count();
	}
}
