package lab9.problem3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * @author binhtran
 *
 */
public class Better {
	final BiFunction<Character, Character, Function<Integer, Predicate<String>>> funcCountWords = (c,
			d) -> len -> word -> (word.contains(c.toString()) && !word.contains(d.toString()) && word.length() == len);

	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(funcCountWords.apply(c, d).apply(len)).count();
	}
}
