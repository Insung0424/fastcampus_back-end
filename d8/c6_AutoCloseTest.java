<<<<<<< HEAD
package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
			
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try (obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("end");
	}

}
=======
package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
			
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try (obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("end");
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
