import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {

		String original, reverse = "";
		System.out.println("Enter string to reverse");
		Scanner sc = new Scanner(System.in);
		original = sc.next();

		System.out.println("original String is: " + original);

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("Reversed String is: " + reverse);

	}

}
