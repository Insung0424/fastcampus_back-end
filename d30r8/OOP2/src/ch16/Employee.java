package ch16;

public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String name;
	private String depa;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepa() {
		return depa;
	}
	public void setDepa(String depa) {
		this.depa = depa;
	}
	
}
