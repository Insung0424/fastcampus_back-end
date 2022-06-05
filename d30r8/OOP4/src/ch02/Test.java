package ch02;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(100,"Ke");
		Student s2 = new Student(100,"Ke");
		Student s3 = s1;
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(System.identityHashCode(s3));//실제해시코드
		
		s1.setStudetnName("L");
		Student copy = (Student) s1.clone();
		System.out.println(copy);
	}

}
