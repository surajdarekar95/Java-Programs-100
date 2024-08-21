import java.util.Scanner;

public class Break_Use {

	public static void main(String[] args) {

		double num, sum = 0.0;
		Scanner sv = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number");
			num = sv.nextDouble();
			if (num < 0.0) {
				break;
			}

			sum = sum + num;
		}

		System.out.println("Sum = " + sum);

	}

}
