<<<<<<< HEAD
package ch06;

public class GoldCustomer extends Customer {

	double saleRatio;	
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);

		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
=======
package ch06;

public class GoldCustomer extends Customer {

	double saleRatio;	
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);

		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
