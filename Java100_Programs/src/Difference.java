
public class Difference {

	/*
	 * Difference between Static and Instance method working in java Program
	 */

	public static void main(String[] args) {

		display();
		Difference t = new Difference();
		t.show();
	}

	static void display() {
		System.out.println("Programming is amazing.");
	}

	void show() {
		System.out.println("Java is awesome.");
	}

}
