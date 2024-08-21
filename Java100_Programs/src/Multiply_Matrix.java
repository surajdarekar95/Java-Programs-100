
public class Multiply_Matrix {

	public static void main(String[] args) {

		int a[][] = { { 1, 5, 6 }, { 8, 7, 5 }, { 5, 3, 7 } };
		int b[][] = { { 5, 3, 9 }, { 7, 6, 4 }, { 2, 3, 9 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {

					c[i][j] = a[i][j] * b[i][j];
				}

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
