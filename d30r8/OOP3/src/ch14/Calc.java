package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int n1,int n2);
	int substract(int n1,int n2);
	int times(int n1,int n2);
	int divide(int n1,int n2);
	
	default void des() {
		System.out.println("cal");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total=0;
		for(int num:arr) {
			total+=num;
		}
		mystatic();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void mystatic() {
		System.out.println("static");
	}
}
