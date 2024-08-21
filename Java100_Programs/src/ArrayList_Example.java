import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("suraj");
		list.add("Rohan");
		list.add("amit");
		list.add("abhijit");
		list.add("ajay");
		list.add("vijay");
		list.add("vinod");

		System.out.println(list);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList<Integer> itr1 = new ArrayList<Integer>();
		itr1.add(10);
		itr1.add(20);
		itr1.add(20);
		itr1.add(40);
		itr1.add(30);

		System.out.println(itr1);

		Iterator itr2 = itr1.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
