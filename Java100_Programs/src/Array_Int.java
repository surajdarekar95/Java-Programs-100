import java.util.Scanner;

public class Array_Int {

	public static void main(String[] args) {

		int[] a = new int[6];
		System.out.println("You can add only "+a.length+ " elements in array");
	
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		


		for (int b : a) {
			System.out.println(b);
		}
		
		System.out.println("Using traditional for loop");
		for(int i=0;i<6;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
