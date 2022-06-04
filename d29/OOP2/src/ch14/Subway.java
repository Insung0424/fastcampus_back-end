package ch14;

public class Subway {
	int SubwayNum;
	int count;
	int money;
	
	public Subway(int SubwayNum) {
		this.SubwayNum=SubwayNum;
	}
	
	public void take(int money) {
		this.money=money;
		count++;
	}
	
	public void showSubwayInfo() {
		System.out.println(SubwayNum +"의 승객수는 "+count +"이고, 수입은"+money+"원 입니다");
	}
}
