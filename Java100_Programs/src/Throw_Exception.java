// How to throw exception in java Program
public class Throw_Exception {
	
	static void validate_Age(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible for vote");
		}else {
			System.out.println("Welcome to vote ");
		}
	}

	public static void main(String[] args) {

		validate_Age(18);
	}

}
