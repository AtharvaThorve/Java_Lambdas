
public class Closures {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, new Process() {
			@Override
			public void process(int a) {
				System.out.println(a + b);
				// no need to declare b as final as it is considered to be effectively final
				// value of b cannot be changed throughout the program
			}
		});
		long x = System.currentTimeMillis();
		doProcess(a, i -> System.out.println(i + b));
		long y = System.currentTimeMillis();
		System.out.println(y - x);
		// b is now a closure so its value cannot be changed

	}

	public static void doProcess(int i, Process process) {
		process.process(i);
	}
}

interface Process {
	public void process(int a);
}