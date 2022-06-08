package Doit;

public class Person {
	private String name;
	private String phoneNumber;
	public Person(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	@Override
	public String toString() {
		return name+" "+phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
