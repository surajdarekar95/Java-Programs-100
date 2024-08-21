
public class Count_Vowels_NonVowels {

	public static void main(String[] args) {

		String a = "Welcome";

		int vowels = 0;
		int NonVowels = 0;

		for (int i = 0; i <= a.length()-1; i++) {
			char ch = a.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o'
					|| ch == 'u' || ch == 'U') {
				vowels++;
			} else {
				NonVowels++;
			}

		}

		System.out.println("Count of vowels is " + vowels);
		System.out.println("Count of Non Vowels is " + NonVowels);
	}

}
