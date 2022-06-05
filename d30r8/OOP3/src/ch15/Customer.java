package ch15;

public class Customer implements buy,sell{

	@Override
	public void sell() {
		System.out.println("cus sell");
	}

	@Override
	public void buy() {
		System.out.println("cus buy");
	}

	@Override
	public void order() {
		System.out.println("cus order");
	}
	
	public void hello() {
		System.out.println("hello");
	}

}
