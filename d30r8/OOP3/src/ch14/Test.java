package ch14;

public class Test {

	public static void main(String[] args) {
		int n1 = 10,n2 = 2;
		Calc c = new comcal();
		System.out.println(c.add(n1, n2));
		System.out.println(c.substract(n1, n2));
		System.out.println(c.times(n1, n2));
		System.out.println(c.divide(n1, n2));
		
		c.des();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

	
	
}
