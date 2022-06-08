package Doit;

public class Employee extends Person{
	private String device;
	public Employee(String name,String phoneNumber,String device){
		super(name,phoneNumber);
		this.device=device;
	}
	@Override
	public String toString() {
		return super.getName()
				+" "
				+super.getPhoneNumber()
				+" "+
				this.device; 
	}
	public String getDevice() {
		return device;
	}
	
}
