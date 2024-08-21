import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Book {

	int id, quantity;
	String name, author, publisher;

	public Book(int id, int quantity, String name, String author, String publisher) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;

	}

}

public class ArrayList_UserDefined {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<>();

		Book b1 = new Book(01, 10, "maharashtra", "ShivajiMaharaj", "balasaheb");
		Book b2 = new Book(02, 20, "Ramayan", "walmiki", "self");
		Book b3 = new Book(03, 30, "Mahabharat", "Krishn", "self");
		Book b4 = new Book(04, 40, "Chawa", "Sambhaji", "maharaj");

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		System.out.println("Original content of list is: ");

		for (Book b : list) {

			System.out.println(b.id + " " + b.quantity + " " + b.name + " " + b.author + " " + b.publisher);
		}

		ListIterator<Book> print = list.listIterator();
		System.out.println("Modified content of list in backward is: ");

		while (print.hasNext()) {
			Book st = (Book) print.next();
			System.out.println(st.id + " " + st.quantity + " " + st.name + " " + st.author + " " + st.publisher);

		}

	}

}
