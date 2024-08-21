
public class Split_String {

	public static void main(String[] args) {

		String sp = "i am giving interview for infoysis";
		String SP[] = sp.split("\\s");

		for (String sp1 : SP) {
			System.out.println(sp1);
			//System.out.println(split.length());
			if(sp1.contains("giving")) {
				System.out.println(true);
			}
			
			
		}
		
		
		
		
	}

}
