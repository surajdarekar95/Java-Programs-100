import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		String s1, s2;

		Scanner str = new Scanner(System.in);
		System.out.println("Enter your first string");

		s1 = str.next();
		System.out.println("Enter your Second string");
		s2 = str.next();

		if (s1.compareTo(s2) > 0)
		{
			System.out.println("First string is greater than second.");
		} else if (s1.compareTo(s2) < 0)
		{
			System.out.println("second string is greater than first.");

		} else 
		{
			System.out.println("Both strings are equal");

		}

	}

}
