import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {

		String number1, number2;

		System.out.println("Enter first large number");
		Scanner lm = new Scanner(System.in);
		number1 = lm.next();

		System.out.println("Enter second large number");
		number2 = lm.next();

		BigInteger big1 = new BigInteger(number1);
		BigInteger big2 = new BigInteger(number2);
		BigInteger sum;

		sum = big1.add(big2);

		System.out.println("Sum of two big integers is " + sum);
	}

}
