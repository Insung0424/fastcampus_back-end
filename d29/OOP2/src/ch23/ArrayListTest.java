package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> lb = new ArrayList<>(); 
		lb.add(new Book("tb1","jjr"));
		lb.add(new Book("tb2","jjr"));
		lb.add(new Book("tb3","jjr"));
		lb.add(new Book("tb4","jjr"));
		lb.add(new Book("tb5","jjr"));
		
		for(int i=0;i<lb.size();i++) {
			lb.get(i).showInfo();
		}
		
	}

}
