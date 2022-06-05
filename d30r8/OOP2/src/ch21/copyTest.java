package ch21;

public class copyTest {

	public static void main(String[] args) {
		Book[] lb = new Book[5];
		Book[] copy = new Book[5];
		
		lb[0] = new Book("tb1","jjr");
		lb[1] = new Book("tb2","jjr");
		lb[2] = new Book("tb3","jjr");
		lb[3] = new Book("tb4","jjr");
		lb[4] = new Book("tb5","jjr");
		
		copy[0] = new Book();
		copy[1] = new Book();
		copy[2] = new Book();
		copy[3] = new Book();
		copy[4] = new Book();
		
		for(int i=0;i<copy.length;i++) {
			copy[i].setAuthor(lb[i].getAuthor());
			copy[i].setName(lb[i].getName());
		}
//		System.arraycopy(lb, 0, copy, 0, 5);
		
		lb[0].setAuthor("bk");
		lb[0].setName("na");
		
		for(Book l: lb) {
			l.showInfo();
		}
		System.out.println();

		
		for(Book i: copy) {
			i.showInfo();
		}
		
		
		
		
	}

}
