package ch04;

public class Test {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"Lee");
		customerLee.bonus = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee);
		System.out.println(price);
		
		Vip customerk = new Vip(10020,"kim");
		customerk.bonus = 10000;
		price = customerk.calcPrice(1000);
		System.out.println(customerk);
		System.out.println(price);
		
		
	}

}
