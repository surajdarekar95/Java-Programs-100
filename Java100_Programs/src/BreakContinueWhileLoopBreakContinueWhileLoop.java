import java.util.Scanner;

public class BreakContinueWhileLoopBreakContinueWhileLoop {

	public static void main(String[] args) {

		int s;
		Scanner sc = new Scanner(System.in);

		while (true) 
		
		{
			System.out.println("Enter an Integer");
			s = sc.nextInt();

			if (s != 0) 
			{
				System.out.println("You Entered " + s);
				continue;
			} else 
			{
				break;
			}
		}
		
		System.out.println("You Enterred 0");
	}
}