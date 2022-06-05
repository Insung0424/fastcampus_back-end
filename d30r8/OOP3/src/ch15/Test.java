package ch15;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.buy();
		c.sell();
		c.hello();
		c.order();
		
		buy b = c;
		b.buy();
		b.order();
		
		sell s = c;
		s.sell();
		s.order();
	}

}
