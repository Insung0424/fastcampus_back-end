<<<<<<< HEAD
package ch08;

public class ArrayIndexException {

	public static void main(String[] args) {

			int[] arr = {1,2,3,4,5};
			
			try {
				for(int i=0; i<=5; i++) {
					System.out.println(arr[i]);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage()); //Index 5 out of bounds for length 5
					System.out.println(e.toString());
					//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
				}
			System.out.println("pass");
			}
	}


=======
package ch08;

public class ArrayIndexException {

	public static void main(String[] args) {

			int[] arr = {1,2,3,4,5};
			
			try {
				for(int i=0; i<=5; i++) {
					System.out.println(arr[i]);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage()); //Index 5 out of bounds for length 5
					System.out.println(e.toString());
					//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
				}
			System.out.println("pass");
			}
	}


>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
