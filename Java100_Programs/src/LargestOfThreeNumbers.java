import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int x, y, z;

		System.out.println("Enter first number ");
		Scanner num = new Scanner(System.in);
		x = num.nextInt();

		System.out.println("Enter second number ");
		y = num.nextInt();

		System.out.println("Enter third number ");
		z = num.nextInt();

		if (x > y && x > z) {
			System.out.println("First number is greater " + x);
		} else if (y > x && y > z) {
			System.out.println("second number is greater " + y);

		} else {
			System.out.println("third number is greater " + z);

		}

	}

}
