package Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

////5.
//class Circle{
//	int i;
//	Circle(int i){
//		this.i=i;
//	}
//	double area() {
//		return 3.14*i*i;
//	}
//	public String toString() {
//		return " "+i;
//	}
//	public boolean equals(Circle c) {
//		if(this.i == c.i) {
//			return true;
//		}
//		return false;
//	}
//}

////7.
//class Tv {
//	private int size;
//
//	Tv(int size) {
//		this.size = size;
//	}
//
//	protected int getsize() {
//		return size;
//	}
//}
//class Tv1 extends Tv{
//	private String s;
//	Tv1(int i,String s){
//		super(i);
//		this.s=s;
//	}
//	public void show() {
//		System.out.println(s+" "+getsize()+"인치 Tv");
//	}
//}

////8.
//class Point{
//	int a,b;
//	Point(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public String toString() {
//		return a+"."+b;
//	}
//}

////9.
//interface Re{
//	default void show() {
//		System.out.println("사각형!!");
//	}
//	abstract int area();
//}
//class Rec implements Re{
//	int i,j;
//	Rec(int i,int j){
//		this.i=i;
//		this.j=j;
//	}
//	@Override
//	public int area() {
//		return i*j;
//	}
//}

////10.
//class Book{
//	String a,b;
//	Book(){
//		this("생성자","호출!!");//this() 는 기준이 된 생성자에 모든걸 가져옴?
//	}
//	Book(String a){
//		this(a,"작가미상"); //this() 는 기준이 된 생성자에 모든걸 가져옴?
//	}
//	Book(String a,String b){
//		this.a=a;
//		this.b=b;
//		System.out.println(a+" "+b); // 여기서 출력을 한번함
//	}
//}

public class Task {

////	4.
//	static int adder(int i,int j){
//		return i+j;
//	}
//	static double exp(double i) {
//		return i*i;
//	}
	public static void main(String[] args) {
////		1. 10/4 한 결과값을 소수점까지 출력해라
//		System.out.println((double)10/4);
		
////		2.while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
//		int i=1;
//		int sum=0;
//		while(i <= 100) {
//			if(i%5 == 0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
////		3.0~30까지 수 중에서 5의 배수를 제외하고 출력해라.
////		(무한 반복문과 break, continue를 다 사용하여 출력)
//		for(int i=0;;) {
//			if(i>=31) {
//				break;
//			}
//			if(i%5==0) {
//				i++; // 이부분이 없으면 계속 0만 반복함
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
////		4.main함수를 보고 adder, exp 함수를 작성해라.
//		int result=adder(10,20); //두 수의 합 출력
//		System.out.println(result);
//		System.out.println(exp(3.5));  //3.5의 제곱한 값 출력
		
////		5.equals(두 원의 면적이 같은지 비교), toString메소드를 
////		사용하여 완성시켜라.(반지름이 30임)
//		Circle a = new Circle(30);
//		Circle b = new Circle(30);
//		System.out.println("반지름" + a);
//		System.out.println("반지름" + b);
//		if (a.equals(b)) {
//			System.out.println("같은 원");
//		} else {
//			System.out.println("다른 원");
//		}
		
////		6.Scanner로 입력 받은 이름(문자열), 
////		id(문자열)를 한 줄마다 파일(test02.txt)에 저장해라.
////		“그만” 입력하면 종료시켜라. “그만” 입력하기 전까지의 문자열을 
////		파일에 저장해라.(break, FileWriter 사용)
//		Scanner sc =new Scanner(System.in);
//		try {
//			FileWriter fw = new FileWriter("test02.txt");
//			String id;
//			while(true) {
//				id=sc.nextLine();
//				if(id.equals("그만")) {
//					break;
//				}
//				fw.write(id);
//				fw.write("\n");
//			}
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();}
		
////		7.Tv클래스와main()를 보고 Tv클래스를 상속받은 Tv1클래스를작성해라.
//		Tv1 t=new Tv1(20, "삼성");
//		t.show(); //삼성 20인치 Tv 출력
		
////		8.main()를 보고 클래스를 작성해라
//		Point p = new Point(3,4);
//		System.out.println(p); //3.4출력
		
////		9.
////		main()를 보고 인터페이스를 작성해라. 
////		(인터페이스명은 Re, 모든 메소들을 인터페이스안에서 선언하고 
////				show함수는 default로 설정,area는 abstract로 설정)
//		Re r=new Rec(10,20);
//		r.show(); //"사각형!!" 출력
//		System.out.println("면적 " + r.area());
		
////		10.다음 main함수를 보고 작성해라.
//		Book b1=new Book("멋진 신세계", "올더스 헉슬리");
//		Book b2=new Book("더 해빙");
//		Book b3=new Book(); 
		
////		11.
//		boolean b = false;
//		String s = Boolean.toString(b);
		
////		12.
//		String s = "36.5";
//		double d = Double.parseDouble(s);
		
////		13.
//		String s = "35";
//		double d = Integer.parseInt(s);
		
////		14.
////		다음 main()를 보고 추상 클래스와추상메소드 작성해라.
////		(total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)
//		Ab c=new Cd();
//		System.out.println(c.total(new int []{1,2,3,4,5}));
	}
}
////14.
//abstract class Ab{
//	abstract int total(int []a);
//}
//class Cd extends Ab{
//	int total(int []a) {
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
//		return sum;
//	}
//}