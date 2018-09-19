package lab7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		list.forEach(new MyConsumer());
	}
	
	static class MyConsumer implements Consumer<String> {

		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
		
	}
}