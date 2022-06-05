package ch11;

public class Test {

	public static void main(String[] args) {
		int n1 = 10,n2 = 2;
		Calc c = new comcal();
		System.out.println(c.add(n1, n2));
		System.out.println(c.substract(n1, n2));
		System.out.println(c.times(n1, n2));
		System.out.println(c.divide(n1, n2));
		
	}

}
