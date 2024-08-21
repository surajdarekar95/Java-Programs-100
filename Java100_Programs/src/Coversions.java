
public class Coversions {

	public static void main(String[] args) {

		// String to Integer conversion

		String s1 = "10";

		int num = Integer.parseInt(s1);
		System.out.println(num);

		// convert integer to string

		int num1 = 20;

		String s = Integer.toString(num1);

		String s2 = String.valueOf(num1);
		System.out.println(s2);
		System.out.println(s);

		// convert string to long

		String s3 = "100345632486622";
		long l = Long.parseLong(s3);
		System.out.println(l);

		// string to float

		String s4 = "10.20";
		float f = Float.parseFloat(s4);
		System.out.println(f);

		// string to double

		String s5 = "6.54";
		double d = Double.parseDouble(s5);
		System.out.println(d);

	}

}
