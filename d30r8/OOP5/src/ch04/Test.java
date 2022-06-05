package ch04;

public class Test {

	public static void main(String[] args) {
		MyStack stack = new MyStack(3);
		
		stack.push(0);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		
		stack.printAll();
		System.out.println("============");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("============");
		
		System.out.println(stack.peek());
		System.out.println();
		stack.printAll();
		
		
	}

}
