<<<<<<< HEAD
package ch15;

public class CustomerTest {

	public static void main(String[] args) {
			
		Customer customer = new Customer();
		customer.Buy();
		customer.Sell();
		customer.hello();
		customer.order();
		
		Buy buyer = customer;
		buyer.Buy();
		buyer.order();
		
		Sell seller = customer;
		seller.Sell();
		seller.order();
	}

}
=======
package ch15;

public class CustomerTest {

	public static void main(String[] args) {
			
		Customer customer = new Customer();
		customer.Buy();
		customer.Sell();
		customer.hello();
		customer.order();
		
		Buy buyer = customer;
		buyer.Buy();
		buyer.order();
		
		Sell seller = customer;
		seller.Sell();
		seller.order();
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
