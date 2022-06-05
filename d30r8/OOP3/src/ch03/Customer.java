package ch03;

public class Customer {
	protected int cId;
	protected String cName;
	protected String grade;
	int bonus;
	double ratio;
	
	public Customer() {
		grade="siver";
		ratio = 0.01;
		System.out.println("born");
	}
	
	public Customer(int cId,String cName) {
		this.cId=cId;
		this.cName=cName;
		grade="siver";
		ratio = 0.01;
		System.out.println("born");
	}
	
	
	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int calcPrice(int price) {
		bonus+=price*ratio;
		return price;
	}
	
	public String toString() {
		return cName+" "+grade+" "+bonus;
	}
}
