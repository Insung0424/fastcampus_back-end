package ch03;

public class Stest {

	public static void main(String[] args) {
		String j = "java";
		String a = "android";
		
		StringBuilder st = new StringBuilder(j);
		System.out.println(System.identityHashCode(st));
		st.append(a);
		System.out.println(System.identityHashCode(st));
		
		String b = st.toString();
		System.out.println(b);
	}

}
