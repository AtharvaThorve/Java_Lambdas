public class Person {
	private int age;
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int age) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Name:" + getFirstName() + " " + getLastName() + " Age:" + getAge();
	}
}
