<<<<<<< HEAD
package ch14;

public class Bus {
		int busNumber;
		int passengerCount;
		int money;
		
		public Bus(int busNumber) {
			this.busNumber = busNumber;
		}
		
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		
		public void showBusInfo() {
			System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
		}
}
=======
package ch14;

public class Bus {
		int busNumber;
		int passengerCount;
		int money;
		
		public Bus(int busNumber) {
			this.busNumber = busNumber;
		}
		
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		
		public void showBusInfo() {
			System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
