<<<<<<< HEAD
package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
			
		MyNumber myNumber = (x, y)-> x > y? x: y;
		// 람다식을 인터페이스 자료형 max 변수에 대입
		
		System.out.println(myNumber.getMax(12,4));
		// 인터페이스 자료형 변수로 함수 호출
	}

}
=======
package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
			
		MyNumber myNumber = (x, y)-> x > y? x: y;
		// 람다식을 인터페이스 자료형 max 변수에 대입
		
		System.out.println(myNumber.getMax(12,4));
		// 인터페이스 자료형 변수로 함수 호출
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
