package ch02;

public class Test {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setcName("Lee");
		customerLee.setcId(10010);
		customerLee.bonus = 1000;
		System.out.println(customerLee);
		
		Vip customerk = new Vip();
		customerk.setcName("kim");
		customerk.setcId(10020);
		customerk.bonus=10000;
		System.out.println(customerk);
	}

}
