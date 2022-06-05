package ch02;

public class Vip extends Customer{
	double saleRatio;
	private int agentId;
	
	public Vip() {
		super();
		grade = "vip";
		ratio = 0.05;
		saleRatio = 0.1;
	}

	public int getAgentId() {
		return agentId;
	}
	
	
}
