
public class Palidrome_1to_1000 {

	public static void main(String[] args) {

		
		
		for (int n = 10; n <= 1000; n++) {
			int num = 0;
			int rev = 0;
			num = n;
			while (num > 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}

			if (n == rev) {
				System.out.println("Number is Palidrome " + n);
			}
		}

	}

}
