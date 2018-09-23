package lab9.problem9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * a. Is there any Vegetarian meal available ( return type boolean)
	 * 
	 * @return
	 */
	public static boolean isAnyVegeterianMealAvailable() {
		return menu.stream().anyMatch(Dish::isVegetarian);
	}

	/**
	 * b. Is there any healthy menu have calories less than 1000 ( return type
	 * boolean)
	 * 
	 * @return
	 */
	public static boolean isAnyHavingCalorieLessThan1000() {
		return menu.stream().anyMatch(d -> d.getCalories() < 1000);
	}

	/**
	 * c. Is there any unhealthy menu have calories greater than 1000 ( return
	 * type boolean)
	 * 
	 * @return
	 */
	public static boolean isAnyHavingColoriesMoreThan1000() {
		return menu.stream().anyMatch(d -> d.getCalories() > 1000);
	}

	/**
	 * d. find and return the first item for the type of MEAT( return type
	 * Optional<Dish>)
	 * 
	 * @return
	 */
	public static Optional<Dish> firstDishWithMeat() {
		return menu.stream().filter(d -> d.getType() == Type.MEAT).findFirst();
	}

	/**
	 * e. calculateTotalCalories() in the menu using reduce. (return int)
	 * 
	 * @return
	 */
	public static int calculateTotalCalories() {
		return menu.stream().map(d -> d.getCalories()).reduce(0, (c1, c2) -> c1 + c2);
	}

	/**
	 * f. calculateTotalCaloriesMethodReference()in the menu using
	 * MethodReferences. (return int)
	 * 
	 * @return
	 */
	public static int calculateTotalCaloriesMethodReference() {
		return menu.stream().map(d -> d.getCalories()).reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("Is there any Vegetarian meal available: " + Dish.isAnyVegeterianMealAvailable());
		System.out.println(
				"Is there any healthy menu have calories less than 1000: " + Dish.isAnyHavingCalorieLessThan1000());
		System.out.println("Is there any unhealthy menu have calories greater than 1000: "
				+ Dish.isAnyHavingColoriesMoreThan1000());
		System.out.println("Find and return the first item for the type of MEAT: "
				+ (Dish.firstDishWithMeat().isPresent() ? Dish.firstDishWithMeat().get() : "No"));
		System.out.println("Total Calories using reduce: " + Dish.calculateTotalCalories());
		System.out.println("Total Calories using Method Reference: " + Dish.calculateTotalCaloriesMethodReference());
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
}