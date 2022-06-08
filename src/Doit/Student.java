package Doit;

public class Student extends Person{
	private int grade;
	public Student(String name, String phoneNumber,int grade) {
		super(name, phoneNumber);
		this.grade=grade;
	}
	@Override
	public String toString() {
		return super.getName()
				+" "
				+super.getPhoneNumber()
				+" "+
				this.grade;
	}
	public int getGrade() {
		return grade;
	}
	
}
