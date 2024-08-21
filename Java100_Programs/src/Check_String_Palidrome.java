import java.util.Scanner;

public class Check_String_Palidrome {

	public static void main(String[] args) {

		String org, rev = "";

		System.out.println("Enter String ");
		Scanner r = new Scanner(System.in);
		org = r.next();
		int len = org.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}

		if (rev.equals(org)) {
			System.out.println(org + " is palidrome");
		} else {
			System.out.println(org + " is Not plaidrome");
		}
	}

}
