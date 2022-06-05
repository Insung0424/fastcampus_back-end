<<<<<<< HEAD
package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void Sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void Buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

//	@Override
//	public void order() {
//		ch15.Buy.super.order();
//	}
		
	public void hello() {
		System.out.println("hello");
	}
}
=======
package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void Sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void Buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

//	@Override
//	public void order() {
//		ch15.Buy.super.order();
//	}
		
	public void hello() {
		System.out.println("hello");
	}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
