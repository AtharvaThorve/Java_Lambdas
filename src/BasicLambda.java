
public class BasicLambda {

	public static void main(String[] args) {
		MyLambda lambdaGreet = () -> {
			System.out.println("Hello world");
		};
		MyAdd lambdaAdd = (int a, int b) -> a + b;
		lambdaGreet.foo();
		lambdaAdd.add(1, 2);
	}
}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int a, int b);
}