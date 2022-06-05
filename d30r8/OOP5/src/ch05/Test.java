package ch05;

public class Test {

	public static void main(String[] args) {
		MyQueue liq = new MyQueue();
		liq.enQu("A");
		liq.enQu("B");
		liq.enQu("C");
		
		liq.printAll();
		
		System.out.println(liq.deQu());
		System.out.println(liq.deQu());
		
		liq.printQu();
		
		
	}

}
