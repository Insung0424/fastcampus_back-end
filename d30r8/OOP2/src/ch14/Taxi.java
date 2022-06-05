package ch14;

public class Taxi {
	String Tn;
	int money;
	
	Taxi(String Tn){
		this.Tn=Tn;
	}
	
	public void take(int n) {
		this.money += n;
	}
	
	public void showTaxiInfo() {
		System.out.println(Tn + "의 수입은 " + money +"원 입니다");
	}
}
