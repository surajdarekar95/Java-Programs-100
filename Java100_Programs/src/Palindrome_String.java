import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		String org_string, revese = "";

		System.out.println("Enter String to check for palidrome");
		Scanner sc = new Scanner(System.in);

		org_string = sc.next();

		int str1 = org_string.length();

		for (int i = str1 - 1; i >= 0; i--) 
		{

			revese = revese + org_string.charAt(i);
		}

		//System.out.println(revese);

		if (org_string.equals(revese))
		{
			System.out.println(org_string+" String is palidrome");
		} else 
		{
			System.out.println(org_string+" string is not palidrome");
		}
	}

}
