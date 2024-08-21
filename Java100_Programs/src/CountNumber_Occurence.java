import java.util.Scanner;

public class CountNumber_Occurence {

	public static void main(String[] args) {

		int n, i = 0;

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		

		while (n > 0) {
			n = n / 10;
			i++;
		}

		System.out.println("Number of digits " + i);
	}

}
