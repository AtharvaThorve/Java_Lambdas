import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 5};
		Integer key = 0;
		
		process(arr, key, wrapperMethod((v, k) -> System.out.println((int)v / (int)k)));
		
		Float[] arr1 = {1f, 2f, 3f, 4f, 5f};
		Float key1 = 0f;
		
		process(arr1, key1, wrapperMethod((v, k) -> System.out.println((float)v / (float)k)));
	}

	@SuppressWarnings("unchecked")
	private static <T, U> void process( T[] arr, T key, BiConsumer<T, U> consumer) {
		for(T i: arr) {
			consumer.accept(i, (U) key);
		}
	}
	
	private static <T, U> BiConsumer<T, U> wrapperMethod(BiConsumer<T, U> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
				System.out.println("In try");
			} catch(ArithmeticException e) {
				System.err.println("Handled in wrapper");
			}
		};
	}
}
