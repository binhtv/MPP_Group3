package lab9.problem8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value
		// (small to high).
		System.out.println("Query 1: Find all transactions from year 2011 and sort them by value (small to high): ");
		transactions.stream().filter(s -> s.getYear() >= 2011)
				.sorted((s1, s2) -> Integer.compare(s1.getValue(), s2.getValue())).forEach(System.out::println);
		// Query 2: What are all the unique cities where the traders work?
		System.out.println();
		System.out.println("Query 2: What are all the unique cities where the traders work?");
		transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);
		// Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println();
		System.out.println("Query 3: Find all traders from Cambridge and sort them by name.");
		transactions.stream().map(t -> t.getTrader()).filter(t -> "Cambridge".equalsIgnoreCase(t.getCity())).distinct()
				.sorted((t1, t2) -> t1.getName().compareTo(t2.getName())).forEach(System.out::println);

		// Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println();
		System.out.println("Query 4: Return a string of all traders names sorted alphabetically.");
		String traderNames = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().collect(Collectors.joining(", "));
		System.out.println(traderNames);
		// Query 5: Are there any trader based in Milan?
		System.out.println();
		System.out.println("Query 5: Are there any trader based in Milan?");
		transactions.stream().map(t -> t.getTrader()).distinct().filter(t -> "Milan".equalsIgnoreCase(t.getCity()))
				.forEach(System.out::println);
		// Query 6: Update all transactions so that the traders from Milan are
		// set to Cambridge.
		System.out.println();
		System.out.println("Query 6: Update all transactions so that the traders from Milan are set to Cambridge.");
		List<Transaction> updatedTransactions = transactions.stream().map(t -> {
			if ("Milan".equalsIgnoreCase(t.getTrader().getCity())) {
				t.getTrader().setCity("Cambridge");
			}
			return t;
		}).collect(Collectors.toList());
		updatedTransactions.forEach(System.out::println);

		// Query 7: What's the highest value in all the transactions?
		System.out.println();
		System.out.println("Query 7: What's the highest value in all the transactions?");
		System.out.println(transactions.stream().map(t -> t.getValue()).max(Integer::compare).orElse(0));
	}
}
