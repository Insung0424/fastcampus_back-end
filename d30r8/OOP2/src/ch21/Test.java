package ch21;

public class Test {

	public static void main(String[] args) {
		Book[] lb = new Book[5];
		
		lb[0] = new Book("tb1","jjr");
		lb[1] = new Book("tb2","jjr");
		lb[2] = new Book("tb3","jjr");
		lb[3] = new Book("tb4","jjr");
		lb[4] = new Book("tb5","jjr");
		
		for(Book l: lb) {
			l.showInfo();
		}
		Book[] copy = new Book[5];
		System.arraycopy(args, 0, lb, 0, 0);
	}

}
