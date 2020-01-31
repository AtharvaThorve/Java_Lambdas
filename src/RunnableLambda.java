
public class RunnableLambda {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside runnable");
			}
		});

		Thread lambdaThread = new Thread(() -> System.out.println("Inside lambda runnable"));
		thread.start();
		lambdaThread.start();
	}

}
