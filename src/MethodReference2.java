import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));

		performConditionally(people, p -> true, p -> System.out.println(p));
		
		performConditionally(people, p -> true, System.out::println);
		// System.out::println == p -> System.out.peintln(p)
		// p -> method(p)
	}

	public static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
