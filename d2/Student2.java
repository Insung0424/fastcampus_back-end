<<<<<<< HEAD
package ch15;

public class Student {
		String studentName;
		int money;
		
		public Student(String studentName, int money) {
			this.studentName = studentName;
			this.money = money;
		}
		
		public void takeTaxi(Taxi taxi) {
			taxi.take(10000);
			this.money -= 10000;
		}
	
		public void showInfo() {
			System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
		}
}
=======
package ch15;

public class Student {
		String studentName;
		int money;
		
		public Student(String studentName, int money) {
			this.studentName = studentName;
			this.money = money;
		}
		
		public void takeTaxi(Taxi taxi) {
			taxi.take(10000);
			this.money -= 10000;
		}
	
		public void showInfo() {
			System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
