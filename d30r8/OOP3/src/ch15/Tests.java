package ch15;

public class Tests {

	public static void main(String[] args) {
		Queue bq = new BookShelf();
		bq.enQueue("토지1");
		bq.enQueue("토지2");
		bq.enQueue("토지3");
		bq.enQueue("토지4");
		bq.enQueue("토지5");
		bq.enQueue("토지6");
		
		System.out.println(bq.getSize());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
	}

}
