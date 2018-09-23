package lab9.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Union {
	public Set<String> union(List<Set<String>> sets) {
		return sets.stream().flatMap(s -> s.stream()).collect(Collectors.toCollection(LinkedHashSet::new));
	}

	public static void main(String... strings) {
		Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
		Set<String> set2 = new HashSet<>(Arrays.asList("D"));
		Set<String> set3 = new HashSet<>(Arrays.asList("1", "3", "5"));
		List<Set<String>> sets = new ArrayList<>(Arrays.asList(set1, set2, set3));
		System.out.println("Before doing union: ");
		System.out.println(sets);
		Union u = new Union();
		Set<String> afterSets = u.union(sets);
		System.out.println("After doing union: ");
		System.out.println(afterSets);
	}
}
