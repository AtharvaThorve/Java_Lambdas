import java.util.Arrays;
import java.util.List;

public class CollectionsIterations {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Using for loop");

		for (int i = 0; i < people.size(); ++i) {
			System.out.println(people.get(i));
		}

		System.out.println("Using for in loop");

		for (Person p : people) {
			System.out.println(p);
		}

		// External iterations

		System.out.println("Using lambda for each loop");

		people.forEach(System.out::println);
		// System.out::println == p -> System.out.println(p)

		// Internal iterations
		// Safe when using multi threading or parallel execution
	}

}
