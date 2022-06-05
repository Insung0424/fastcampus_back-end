package ch03;

public class Test {

	public static void main(String[] args) {
		String j = "java";
		
		String a = "android";
		
		System.out.println(System.identityHashCode(j));
		
		j = j.concat(a);
		
		System.out.println(System.identityHashCode(j));
		
		
	}

}
