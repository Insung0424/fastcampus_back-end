<<<<<<< HEAD
package review01;

public class StudentTest {

	public static void main(String[] args) {
		ArrayStudent studentLee = new ArrayStudent(1001, "Lee");
		
		studentLee.addSubject("Korean", 100);
		studentLee.addSubject("Math", 50);
		
		ArrayStudent studentKim = new ArrayStudent(1002, "Kim");
		
		studentKim.addSubject("Korean", 70);
		studentKim.addSubject("Math", 85);
		studentKim.addSubject("English", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}

=======
package review01;

public class StudentTest {

	public static void main(String[] args) {
		ArrayStudent studentLee = new ArrayStudent(1001, "Lee");
		
		studentLee.addSubject("Korean", 100);
		studentLee.addSubject("Math", 50);
		
		ArrayStudent studentKim = new ArrayStudent(1002, "Kim");
		
		studentKim.addSubject("Korean", 70);
		studentKim.addSubject("Math", 85);
		studentKim.addSubject("English", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}

>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
