
public class StringMethods {

	public static void main(String[] args) {

		int n;
		String s = "Java Programming ", t = "", u = "";

		n = s.length();

		System.out.println("Number of characters = " + n);

		t = s.replace("Java", "C++");

		System.out.println("New String : " + t);

		u = s.concat("is fun");

		System.out.println("New String : " + u);

	}

}
