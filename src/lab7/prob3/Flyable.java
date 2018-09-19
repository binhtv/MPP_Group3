package lab7.prob3;

public interface Flyable {
	default void fly() {
		System.out.println("   fly with wings");
	}
}
