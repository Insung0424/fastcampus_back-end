<<<<<<< HEAD
package ch16;

public class Employee {
		
		public static int serialNum = 1000;
	
		private int employeeId;
		private String employeeName;
		private String department;
		
		public Employee() {
			serialNum++;
			employeeId = serialNum;
		}
		
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
}
=======
package ch16;

public class Employee {
		
		public static int serialNum = 1000;
	
		private int employeeId;
		private String employeeName;
		private String department;
		
		public Employee() {
			serialNum++;
			employeeId = serialNum;
		}
		
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
