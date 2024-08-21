import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);

		System.out.println("input an Integer");

		while ((n = input.nextInt()) != 0) {
			System.out.println("You Entered " + n);
			System.out.println("input an Integer");

		}

		System.out.println("Out of Loop");
	}

}
