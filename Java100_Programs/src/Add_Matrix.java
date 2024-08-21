
public class Add_Matrix {

	public static void main(String[] args) {

		int a[][] = { { 1, 5, 9 }, { 6, 5, 4 }, { 1, 3, 4 } };
		int b[][] = { { 4, 8, 6 }, { 3, 5, 7 }, { 9, 5, 1 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
