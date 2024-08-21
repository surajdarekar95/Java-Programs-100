import java.util.Scanner;

public class Condition_IfElse {

	public static void main(String[] args) {
		int Voting_age, Your_age;

		Voting_age = 18;

		System.out.println("Enter your age");
		Scanner age = new Scanner(System.in);

		Your_age = age.nextInt();

		if (Your_age >= Voting_age)
		{
			System.out.println("Congratulations!!! you are eligible for voting");
		} else
		{
			System.out.println("You cannnot vote.Only after compliting  18 you are elegilbe for voting");
		}
	}

}
