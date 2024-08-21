
public class Reverse_Sentence {

	public static void main(String[] args) {

		String org = "My name is suraj darekar";

		String reversed = reverse_sentence(org);
		System.out.println(reversed);
	}

	public static String reverse_sentence(String org) {
		String rev = "";

		String[] New_str = org.split("\\s");

		for (int i = New_str.length - 1; i >= 0; i--) {
			rev = rev + New_str[i]+" ";
		}

		return rev;
	}

}
