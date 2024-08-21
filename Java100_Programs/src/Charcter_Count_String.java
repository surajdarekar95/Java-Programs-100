import java.util.HashMap;

public class Charcter_Count_String {

	public static void main(String[] args) {

		String s = "ddddarekar";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = s.toCharArray();

		for (char c : ch) {

			if (map.containsKey(c)) {
				int x = map.get(c);
				map.put(c, x + 1);

			} else {

				map.put(c, 1);
			}
		}

		System.out.println(map);
	}

}
