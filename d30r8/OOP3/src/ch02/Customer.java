package ch02;

public class Customer {
	protected int cId;
	protected String cName;
	protected String grade;
	int bonus;
	double ratio;
	
	public Customer() {
		grade="siver";
		ratio = 0.01;
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
