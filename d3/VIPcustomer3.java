<<<<<<< HEAD
package ch04;

public class VIPcustomer extends Customer{
		
		String agentId;
		double saleRatio;
		
//		public VIPcustomer() {
////			super(0, "no-name");
//			bonusRatio = 0.05;
//			saleRatio = 0.1;
//			customerGrade = "VIP";
//			
//			System.out.println("VIPcustomer() call");
//		}
		
		public VIPcustomer(int customerId, String customerName) {
			super(customerId, customerName);
			
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
		}
		
		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			price -= (int)(price * saleRatio);
			return price;
		}

		public String getAgentId() {
			return agentId;
		}
		
}
=======
package ch04;

public class VIPcustomer extends Customer{
		
		String agentId;
		double saleRatio;
		
//		public VIPcustomer() {
////			super(0, "no-name");
//			bonusRatio = 0.05;
//			saleRatio = 0.1;
//			customerGrade = "VIP";
//			
//			System.out.println("VIPcustomer() call");
//		}
		
		public VIPcustomer(int customerId, String customerName) {
			super(customerId, customerName);
			
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
		}
		
		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			price -= (int)(price * saleRatio);
			return price;
		}

		public String getAgentId() {
			return agentId;
		}
		
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
