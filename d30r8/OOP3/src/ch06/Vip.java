package ch06;

public class Vip extends Customer{
	double saleRatio;
	private int agentId;
	
	public Vip() {
		grade = "vip";
		ratio = 0.05;
		saleRatio = 0.1;
	}
	
	public Vip(int cId,String cName) {
		super(cId,cName);
		grade = "vip";
		ratio = 0.05;
		saleRatio = 0.1;
	}

	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		bonus += price*ratio;
		price -= (int) (price * saleRatio);
		return price;
	}
	
	
}
