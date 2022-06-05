package ch03;

public class Vip extends Customer{
	double saleRatio;
	private int agentId;
	
	public Vip() {
		grade = "vip";
		ratio = 0.05;
		saleRatio = 0.1;
		System.out.println("reborn");
	}
	
	public Vip(int cId,String cName) {
		super(cId,cName);
		grade = "vip";
		ratio = 0.05;
		saleRatio = 0.1;
		System.out.println("reborn");
	}

	public int getAgentId() {
		return agentId;
	}
	
	
}
