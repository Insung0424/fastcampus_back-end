<<<<<<< HEAD
package ch02;

public class Student implements Cloneable{
		private int studentNum;
		private String studentName;
		
		public Student (int studentNum, String studentName) {
			this.studentName = studentName;
			this.studentNum = studentNum;
		}
		
		public void setStudentName(String name) {
			this.studentName = name;
		}
		public String toString () {
			return studentNum + "," + studentName;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student)obj;
				if (this.studentNum == std.studentNum)
					return true;
				else return false;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return studentNum;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		
		
		
}
=======
package ch02;

public class Student implements Cloneable{
		private int studentNum;
		private String studentName;
		
		public Student (int studentNum, String studentName) {
			this.studentName = studentName;
			this.studentNum = studentNum;
		}
		
		public void setStudentName(String name) {
			this.studentName = name;
		}
		public String toString () {
			return studentNum + "," + studentName;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student)obj;
				if (this.studentNum == std.studentNum)
					return true;
				else return false;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return studentNum;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		
		
		
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
