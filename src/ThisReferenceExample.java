
public class ThisReferenceExample {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, a -> {
			System.out.println("Value of a is " + a);
			System.out.println(this);
			// It works here fine
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int a) {
				System.out.println("Value of a is " + a);
				System.out.println(this);
			}

			public String toString() {
				return "This is an anonymous inner class";
			}
		});

		thisReferenceExample.doProcess(10, a -> {
			System.out.println("Value of a is " + a);
			// System.out.println(this); This does not work as lambda does not touch
			// this reference
		});
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is the main ThisReferencerExample instance";
	}
}
