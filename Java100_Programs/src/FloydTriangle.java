import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		int n, num = 1, c, d;

		System.out.println("Enter the number of rows of floyd's triangle you want");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println("Floyd's triangle :-");

		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}

}
