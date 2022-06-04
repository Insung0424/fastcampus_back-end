package ch14;

public class Bus {
	int busNum;
	int count;
	int money;
	
	public Bus(int busNum) {
		this.busNum=busNum;
	}
	
	public void take(int money) {
		this.money=money;
		count++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum +"의 승객수는 "+count +"이고, 수입은"+money+"원 입니다");
	}
}
