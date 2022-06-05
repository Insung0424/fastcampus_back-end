<<<<<<< HEAD
package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
			
			ArrayList<Book> library = new ArrayList<>();
			
			library.add(new Book("태백산맥1", "조정래"));
			library.add(new Book("태백산맥2", "조정래"));
			library.add(new Book("태백산맥3", "조정래"));
			library.add(new Book("태백산맥4", "조정래"));
			library.add(new Book("태백산맥5", "조정래"));
			
			for (int i =0; i<library.size(); i++) {
				library.get(i).showInfo();
			}
	}

}
=======
package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
			
			ArrayList<Book> library = new ArrayList<>();
			
			library.add(new Book("태백산맥1", "조정래"));
			library.add(new Book("태백산맥2", "조정래"));
			library.add(new Book("태백산맥3", "조정래"));
			library.add(new Book("태백산맥4", "조정래"));
			library.add(new Book("태백산맥5", "조정래"));
			
			for (int i =0; i<library.size(); i++) {
				library.get(i).showInfo();
			}
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
