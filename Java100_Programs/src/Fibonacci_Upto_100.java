
public class Fibonacci_Upto_100 {

	public static void main(String[] args) {

		// Print the value in Fibonacci series up to 100

		int a = 0, b = 1;

		for (int i = 1; i <= 100; i++) {

			int c = a + b;

			if (c <= 100) {
				a = b;
				b = c;
				System.out.println(c);

			}
		}
	}

}
