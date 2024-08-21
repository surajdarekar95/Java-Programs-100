import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "java");
		hm.put(2, "C++");
		hm.put(3, "python");
		hm.put(4, "c#");

		System.out.println(hm);

		for (Map.Entry m : hm.entrySet()) {

			System.out.println(m.getKey()+" "+m.getValue());
		}

		for (Map.Entry n : hm.entrySet()) {
			System.out.println(n);

		}
	}

}
