import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int number,reverse=0;
	

		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		number = num.nextInt();

		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}

		System.out.println("Reversed Number " + reverse);

	}

}
