<<<<<<< HEAD
package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String ("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));  //918221580
		
		buffer.append(android);
		
		System.out.println(System.identityHashCode(buffer));  //918221580
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
=======
package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String ("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));  //918221580
		
		buffer.append(android);
		
		System.out.println(System.identityHashCode(buffer));  //918221580
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
