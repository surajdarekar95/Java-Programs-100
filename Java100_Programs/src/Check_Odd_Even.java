
public class Check_Odd_Even {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		

		for (int num : arr) 
		{

			if (num % 2 == 0) 
			{
				System.out.println("Even Numbers "+num);
			} else 
			{

				System.out.println("odd Numbers "+num);
			}
			

		}
		
		


	}

}
