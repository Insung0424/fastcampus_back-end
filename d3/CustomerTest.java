<<<<<<< HEAD
package ch02;

public class CustomerTest {

	public static void main(String[] args) {
			Customer customerLee = new Customer();
			customerLee.setCustomerName("홍길동");
			customerLee.setCustomerId(10010);
			customerLee.bonusPoint = 1000;
			
			System.out.println(customerLee.showCustomerInfo());
			
			VIPcustomer customerKim = new VIPcustomer();
			customerKim.setCustomerName("김허");
			customerKim.setCustomerId(10020);
			customerKim.bonusPoint = 10000;
			System.out.println(customerKim.showCustomerInfo());
	}

}
=======
package ch02;

public class CustomerTest {

	public static void main(String[] args) {
			Customer customerLee = new Customer();
			customerLee.setCustomerName("홍길동");
			customerLee.setCustomerId(10010);
			customerLee.bonusPoint = 1000;
			
			System.out.println(customerLee.showCustomerInfo());
			
			VIPcustomer customerKim = new VIPcustomer();
			customerKim.setCustomerName("김허");
			customerKim.setCustomerId(10020);
			customerKim.bonusPoint = 10000;
			System.out.println(customerKim.showCustomerInfo());
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
