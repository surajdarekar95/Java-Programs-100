
public class Special_CharCount {

	public static void main(String[] args) {

		/*
		 * Find the special character, uppercase, lowercase, Number of digits in the
		 * given string
		 */

		String s1 = "Hi Welcome To Java Classes Tommorow At 2.00p.m!!";

		int count = 0, count1 = 0, count2 = 0, count3 = 0;

		for (int i = 0; i <= s1.length()-1; i++) {

			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				count++;

			} else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				count1++;

			} else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				count2++;

			} else {
				count3++;
			}
		}

		System.out.println("total no of small letters: " + count);
		System.out.println("total no of capital letters: " + count1);
		System.out.println("total no of digits: " + count2);
		System.out.println("total no of special characters: " + count3);

	}

}
