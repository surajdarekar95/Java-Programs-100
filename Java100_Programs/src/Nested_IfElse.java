import java.util.Scanner;

public class Nested_IfElse {

	public static void main(String[] args) {

		int Markobtained, Passing_Marks;
		char Grade;
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter Your Obtained Marks");
		Markobtained = marks.nextInt();

		Passing_Marks = 40;

		if (Markobtained >= Passing_Marks) {

			if (Markobtained >= 90) 
			{
				Grade = 'A';
				System.out.println("Congratulations you passed with grade " + Grade);
				
			} else if (Markobtained >= 80) 
			{
				Grade = 'B';
				System.out.println("Congratulations you passed with grade " + Grade);

			} else if (Markobtained >= 70)
			{
				Grade = 'C';
				System.out.println("Congratulations you passed with grade " + Grade);

			} else 
			{
				Grade = 'D';
				System.out.println("Congratulations you passed with grade " + Grade);

			}
		} else 
		{
			
			Grade = 'F';
			System.out.println("You Failed Exam your grade is " + Grade);
		}

	}

}
