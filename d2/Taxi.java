<<<<<<< HEAD
package ch15;

public class Taxi {
		String TaxiName;
		int money;
		
		public Taxi(String Taxiname) {
			this.TaxiName = Taxiname;
		}
		
		public void take(int money) {
			this.money += money;
		}
		
		public void showTaxiInfo() {
			System.out.println(TaxiName + "의 수입은 " + money + "입니다.");
		}
}
=======
package ch15;

public class Taxi {
		String TaxiName;
		int money;
		
		public Taxi(String Taxiname) {
			this.TaxiName = Taxiname;
		}
		
		public void take(int money) {
			this.money += money;
		}
		
		public void showTaxiInfo() {
			System.out.println(TaxiName + "의 수입은 " + money + "입니다.");
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
