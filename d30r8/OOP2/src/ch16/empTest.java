package ch16;

public class empTest {

	public static void main(String[] args) {
		Employee employeeL = new Employee();
		employeeL.setName("Lee");
		System.out.println(employeeL.getEmployeeId());
		
		Employee employeek = new Employee();
		employeek.setName("kin");
		
		System.out.println(employeek.getEmployeeId());
		System.out.println(employeeL.getEmployeeId());
		
	}

}
