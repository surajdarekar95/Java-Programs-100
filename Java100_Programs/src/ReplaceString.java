
public class ReplaceString {

	public static void main(String[] args) {

		String name = "My name is suraj. My name is rohan.My name is prashant.My name is vinay";

		String new_string = name.replace("is", "Was");
		String new_one = name.replaceAll("My", "my");

		System.out.println(new_string);
		System.out.println(new_one);

	}

}
