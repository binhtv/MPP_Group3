package lab9.problem10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
		StringBuilder bd = Stream.of(list).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(bd);
		System.out.println("---Contructor 2: ");
		List<?> listHuman = Stream.of(list).collect(ArrayList::new, ArrayList::add, ArrayList::add);
		System.out.println(listHuman);
		System.out.println("---Contructor 3 sum all ages: ");
		System.out.println(Stream.of(list).map(Human::getAge).mapToInt(Integer::new).sum());

		// Query 3 : Count the male candidates whose age is more than 30
		System.out.println("Count the male candidates whose age is more than 30: ");
		System.out.println(
				Stream.of(list).filter(h -> h.getAge() > 30 && "male".equalsIgnoreCase(h.getGender())).count());
	}

}
