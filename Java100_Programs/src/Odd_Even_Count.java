
public class Odd_Even_Count {

	public static void main(String[] args) {

		int num, even_count = 0, odd_count = 0;
		for (int i = 1; i <= 100; i++) {

			num = i;

			if (num % 2 == 0) {

				even_count++;

			} else {
				odd_count++;
			}
		}

		System.out.println("Even_count " + even_count);
		System.out.println("odd_count " + odd_count);

	}

}
