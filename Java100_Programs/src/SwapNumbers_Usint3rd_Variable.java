
public class SwapNumbers_Usint3rd_Variable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int t;

		System.out.println("Numbers Before Swapping " + a + " " + b);

		t = a;
		a = b;
		b = t;

		System.out.println("Numbers after swapping " + a + " " + b);
	}

}
