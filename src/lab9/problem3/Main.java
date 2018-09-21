package lab9.problem3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Binh Tran", "Duy Nga", "Thao Dao", "Tam Nguyen", "Thuy Doan");
		System.out.println(words);
		Good good = new Good();
		System.out.println("Good solution: ");
		System.out.println("Number of the words that contains T, not B and length = 9: " + good.countWords(words, 'T', 'B', 9));
		System.out.println("Number of the words that contains T, not e and length = 9: " + good.countWords(words, 'T', 'e', 9));
		Better better = new Better();
		System.out.println("Better solution: ");
		System.out.println("Number of the words that contains T, not B and length = 9: " + better.countWords(words, 'T', 'B', 9));
		System.out.println("Number of the words that contains T, not e and length = 9: " + better.countWords(words, 'T', 'e', 9));
		
		System.out.println("Best solution: ");
		System.out.println("Number of the words that contains T, not B and length = 9: " + Best.funcCountWords.count(words, 'T', 'B', 9));
		System.out.println("Number of the words that contains T, not e and length = 9: " + Best.funcCountWords.count(words, 'T', 'e', 9));
		
	}
}
