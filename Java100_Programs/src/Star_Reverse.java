
public class Star_Reverse {

	public static void main(String[] args) {

		int star, Numbers_Star;

		for (star = 1; star <= 10; star++) {
			for (Numbers_Star = 10; Numbers_Star >= star; Numbers_Star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
