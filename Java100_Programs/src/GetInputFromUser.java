import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {

		int a;
		float b;
		String c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer value");
		a = sc.nextInt();
		System.out.println("Entered value is " + a);

		System.out.println("\nEnter float value");
		b = sc.nextFloat();
		System.out.println("Entered value is " + b);

		System.out.println("\nEnter String ");
		c = sc.next();
		System.out.println("Entered String is " + c);
	}

}
