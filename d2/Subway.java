<<<<<<< HEAD
package ch14;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
=======
package ch14;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
