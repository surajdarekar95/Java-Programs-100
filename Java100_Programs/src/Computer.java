
//How to create Multiple class in java Program

public class Computer {

	Computer() {
		System.out.println(" Constructor of compuper class");
	}

	void computer_method() {
		System.out.println("Power gone! Shut down your PC soon...");
	}

	public static void main(String[] args) {

		Computer my = new Computer();
		laptop your = new laptop();

		my.computer_method();
		your.laptop_method();

	}

}

class laptop {

	laptop() {
		System.out.println(" Construstor of laptop class ");
	}

	void laptop_method() {
		System.out.println("99% Battery available.");
	}
}
