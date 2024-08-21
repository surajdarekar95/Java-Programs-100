
public class Methods_java {

	// Constructor Method
	Methods_java() 
	{
		System.out.println("Constructor will be called automatically when creating object of class");
	}
	
	// Static Method
	public static void static_Method()
	{
		System.out.println("No  need to create object of class to call static method.Direct calling or using class name");
	}
	
	// Non-Static Method
	
	public void Non_Static()
	{
		System.out.println("To call non-static method we need to create object of class");
		
	}
	
	// Main method
	
	public static void main(String[] args) {
		System.out.println("program Execution always start from main method");
		
		Methods_java cl = new Methods_java();
		cl.Non_Static();
		static_Method();
		Methods_java.static_Method();
		
		
	}
}
