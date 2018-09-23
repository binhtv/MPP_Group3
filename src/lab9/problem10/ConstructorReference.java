package lab9.problem10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female candidates names
		System.out.println("Print only Female candidates names: ");
		Stream.of(list).filter(h -> "Female".equalsIgnoreCase(h.getGender())).map(h -> h.getName())
				.forEach(System.out::println);
		// Query 2 : Create an object by choosing suitable Interface to the
		// specified constructors(Totally 3 constructors) using fourth type of
		// Method Reference ClassName::new. Then print the object status
		System.out.println("Fourth type of  Method Reference usage: ");
		System.out.println("---Contructor 1: ");
		Function<String, Human> func1 = Human::new;
		Human human1 = func1.apply("Binh Tran");
		System.out.println(human1);
		System.out.println("---Contructor 2: ");
		BiFunction<String, Integer, Human> func2 = Human::new;
		Human human2 = func2.apply("Binh Tran", 29);
		System.out.println(human2);
		System.out.println("---Contructor 3: ");
		TriFunction<String, Integer, String, Human> trFunc = Human::new;
		Human human3 = trFunc.apply("Binh Tran", 29, "Male"); 
		System.out.println(human3);
		// Query 3 : Count the male candidates whose age is more than 30
		System.out.println("Count the male candidates whose age is more than 30: ");
		System.out.println(
				Stream.of(list).filter(h -> h.getAge() > 30 && "male".equalsIgnoreCase(h.getGender())).count());
	}

}
