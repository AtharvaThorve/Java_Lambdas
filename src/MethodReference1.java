public class MethodReference1 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> printMessage());
		t.start();
		Thread t2 = new Thread(MethodReference1 :: printMessage);
		// MethodReference1 :: printMessage == () -> printMessage()
		// () -> method()
		t2.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}
