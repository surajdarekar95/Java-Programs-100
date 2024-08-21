import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {

		int n;

		Scanner br = new Scanner(System.in);

		while (true) {

			System.out.println("Input an integer");
			n = br.nextInt();
			if (n == 0) {
				break;

			}

			System.out.println("You  Entered " + n);

		}

		System.out.println("You  Entered " + n);

	}

}
