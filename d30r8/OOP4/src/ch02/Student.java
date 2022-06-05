package ch02;

public class Student implements Cloneable{
	private int studentNum;
	private String studetnName;
	public Student(int studentNum, String studetnName) {
		this.studentNum = studentNum;
		this.studetnName = studetnName;
	}
	
	
	
	public void setStudetnName(String studetnName) {
		this.studetnName = studetnName;
	}



	@Override
	public String toString() {
		
		return studentNum+" "+studetnName;
	}
	@Override
	public int hashCode() {
		
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentNum == std.studentNum) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
