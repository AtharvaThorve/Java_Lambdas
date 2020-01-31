
public class TypeInference {

	public static void main(String[] args) {
		// Most compact form of writing a lambda function
		// When only one argument is present so no parenthesis required
		StringLambdaLength myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		length(s -> s.length());
	}

	public static void length(StringLambdaLength s) {
		System.out.println(s.getLength("Hello lambda"));
	}

	interface StringLambdaLength {
		int getLength(String s);
	}

}
