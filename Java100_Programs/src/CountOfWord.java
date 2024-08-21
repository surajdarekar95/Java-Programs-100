import java.util.HashMap;

public class CountOfWord {

	public static void main(String[] args) {

		String s1 = "suraj darekar suraj suraj suraj";

		String[] s2 = s1.split(" ");

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		for (String c : s2) {

			if (map1.containsKey(c)) {
				int x = map1.get(c);
				map1.put(c, x + 1);
			} else {

				map1.put(c, 1);
			}
		}

		System.out.println(map1);
	}

}
