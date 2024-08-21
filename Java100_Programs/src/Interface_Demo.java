//How to create Interface in java Program

interface info {
	static final String language = "Java";

	public void display();
}

public class Interface_Demo implements info {

	public static void main(String[] args) {

		Interface_Demo in = new Interface_Demo();
		in.display();
	}

	@Override
	public void display() {

		System.out.println(language + " is awesome");
	}

}
