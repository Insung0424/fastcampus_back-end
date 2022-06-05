package ch06;

public class gold extends Customer{
	
	double salesRatio;
	
	public gold(int id,String name) {
		super(id,name);
		salesRatio = 0.1;
		ratio = 0.02;
		grade = "gold";
	}
	

	@Override
	public int calcPrice(int price) {
		bonus += price * ratio;
		return price -= (int) (price * salesRatio);
	}
	
	

}
