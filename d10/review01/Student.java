<<<<<<< HEAD
package review01;

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

		@Override
		public String toString() {
			return studentName + " ramain money is" + money;
		}
		
		
}
=======
package review01;

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

		@Override
		public String toString() {
			return studentName + " ramain money is" + money;
		}
		
		
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
