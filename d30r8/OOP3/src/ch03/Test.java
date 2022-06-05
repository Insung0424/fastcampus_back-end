package ch03;

public class Test {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"Lee");
		customerLee.bonus = 1000;
		System.out.println(customerLee);
		
		Vip customerk = new Vip(10020,"kim");
		customerk.bonus = 10000;
		System.out.println(customerk);
		
		Customer vc = new Vip(12345,"nn");
		
	}

}
