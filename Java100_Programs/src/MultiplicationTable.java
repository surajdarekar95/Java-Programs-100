import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		int n, c;

		Scanner vb = new Scanner(System.in);
		System.out.println("Enter the number for multiplication ");
		n = vb.nextInt();

		for (c = 1; c <= 10; c++) {
			System.out.println(n + "*" + c + "=" + (n * c));
		}
	}

}
