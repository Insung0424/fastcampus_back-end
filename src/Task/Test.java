package Task;

import java.util.Scanner;
import java.util.StringTokenizer;

class Grade{
	//1.1   =========================================================
	private int english,math,science; 
	
	//1.2   =========================================================
	public Grade(){}
	public Grade(int english,int math){
		this(english,math,0);
	}
	public Grade(int english,int math,int science){ 
		this.english=english;
		this.math=math;
		this.science=science;  
	}
	
	//1.3   =========================================================
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getScience() {
		return science;
	}
	public void avg() {
		double sum=0;
		sum += getEnglish();
		sum += getMath();
		sum += getScience();
		System.out.println(sum/3);
	}
	public String toString() {
		return "영어점수 "+getEnglish()
				+" 수학점수 "
				+getMath()
				+" 과학점수 "
				+getScience();
	}
}

//2
abstract class Calc{
	
//	2-1-A    =========================================================
	double op1,op2;
//	2-2-A   =========================================================
	public void set(double op1,double op2) {
		this.op1=op1;
		this.op2=op2;
	}
//	2-3-A   =========================================================
	abstract double calculate();
}
//2-B   =========================================================
class Add extends Calc{
	@Override
	double calculate() {
		return op1 + op2;
	}
}
class Sub extends Calc{
	@Override
	double calculate() {
		return op1 - op2;
	}
}
class Mul extends Calc{
	@Override
	double calculate() {
		return op1 * op2;
	}
}
class Div extends Calc{
	@Override
	double calculate() {
		return op1/op2;
	}
}

public class Test {

	public static void main(String[] args) {
		//1.4  =========================================================
		Grade arr[] = new Grade[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			try {
				System.out.println("영어점수입력");
				int english = sc.nextInt();
				System.out.println("수학점수입력");
				int math = sc.nextInt();
				System.out.println("과학점수입력");
				int science = sc.nextInt();
				arr[i] = new Grade(english,math,science);
				System.out.println(arr[i]);
				System.out.println((i+1)+"번학생의 평균점수는 ");
				arr[i].avg();
			}catch(Exception e) {
				System.out.println("잘못 입력함");
				System.out.println("다시 처음부터 입력");
				sc.next();
				i--;
				continue;
			}
			
		}
		
		System.out.println("=========================절취선=======================");

		
		//  2-c  ==================================================
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		while(true) {
			System.out.println("숫자2개와 연산자를 입력");
			System.out.println("예제 : 10 5 /");
			System.out.println("종료는 end");
			String str = scan.nextLine();
			st = new StringTokenizer(str," ");
			if(str.equals("end")) {
				break;
			}
			try {
				double a1 = Double.parseDouble(st.nextToken());
				double a2 = Double.parseDouble(st.nextToken());
				String c = st.nextToken();
			
				switch (c) {
				case "+":
					Add add = new Add();
					add.set(a1,a2);
					System.out.println("답은 : "+add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.set(a1,a2);
					System.out.println("답은 : "+sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.set(a1,a2);
					System.out.println("답은 : "+mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.set(a1,a2);
					System.out.println("답은 : "+div.calculate());
					break;
				default:
					System.out.println("잘못 입력함");
					break;
				}
			}catch(Exception e) {
				System.out.println("잘못 입력함");
				System.out.println(str);
				continue;
			}
		
		}
		
		System.out.println("=========================절취선=======================");

//		3   =========================================================
		System.out.println("정수형 배열의 크기 입력");
		while(true) {
			try {
				int x = sc.nextInt();
				int Intarr[] = new int[x];
				for(int i=0;i<Intarr.length;i++) {
					Intarr[i] = (int) (Math.random()*101);
				}
				for(int i=0;i<Intarr.length;i++) {
					System.out.printf((i+1)+"의 성적 : %d점\n",Intarr[i]);
				}
			}catch(Exception e) {
				System.out.println("잘못 입력함,다시 입력");
				sc.next();
				continue;
			}
			break;//		이거 근데 무슨성적 구하는거죠
		}
		
	}
		
}
	

