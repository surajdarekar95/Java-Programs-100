import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		// 5.How to convert Fahrenheit to Celsius

		float temperature;
		Scanner tp = new Scanner(System.in);

		System.out.println("Enter temperatue in Fahrenheit");

		temperature = tp.nextInt();

		temperature = ((temperature - 32) * 5) / 9;
		System.out.println("Temperatue in Celsius = " + temperature);

	}

}
