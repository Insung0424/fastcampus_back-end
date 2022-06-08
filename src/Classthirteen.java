import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//class Person{
//	String name;
//	String id;
//	Person(String name){
//		this.name = name;
//	}
//}
//class Student extends Person{
//	Student(String name){
//		super(name);
//	}
//}

//class Fruit{
//	String name;
//	int size;
//	Fruit(String name,int size){
//		this.name=name;
//		this.size=size;
//	}
//	void show() {
//		System.out.println(name + " " + size);
//	}
//}
//class Apple extends Fruit{
//	Apple(String name, int size) {
//		super(name, size);
//	}
//}

//class Elec{
// String color;
// Elec(String c){
//  color=c;
// }
//}
//class Note extends Elec{
// int number;
// Note(String c, int n){
//  super(c); //color=c;
//  number=n;
// } 
//}
//class Ipad extends Note{
//	int size;
//	Ipad(String c,int n,int s){
//		super(c,n);
//		this.size = s;
//	}
//	void show() {
//		System.out.println(color+" "+number+"개 "+size+"인치");
//	}
//}
//class Person{}
//class Student extends Person{}
//class Entertainer extends Person{}
//class Singer extends Entertainer{}

//class A{
//	private int x,y;
//	protected void setX(int x) {
//		this.x=x;
//	}
//}
//class B extends A{
//	private int z;
//	protected void setXY(int a,int b,int c) {
//		setX(a+b);
//		y=b; //error private이라서 접근할 수 없음
//		z=c;
//	}
//}
//class A{
//	int x;
//}
//class B extends A{
//	int y;
//}
//class A{
//	int a;
//}
//class B extends A{
//	int b;
//}
//class C extends B{
//	int c;
//}
//class D extends B{
//	int d;
//}
//class Music{
//	String title;
//	String singer;
//	Music(String title){
//		this.title = title;
//		singer = "방탄";
		//this(title,"방탄");
//	}
//	Music(String title,String singer){
//		this.title = title;
//		this.singer = singer;
//	}
//}
//class Cal{
//	static int add(int a,int b){
//		return a+b;
//	}
//	static int div(int a,int b){
//		return a/b;
//	}
//}
public class Classthirteen {
//	static void pr(Person p) {
//		if(p instanceof Person) {
//			System.out.println("person");
//		}
//		if(p instanceof Student) {
//			System.out.println("Student");
//		}
//		if(p instanceof Entertainer) {
//			System.out.println("Entertainer");
//		}
//		if(p instanceof Singer) {
//			System.out.println("Singer");
//		}
//	}
	public static void main(String[] args) throws IOException {
//		Person p = new Student("tom"); //upcasting
//		// 부모   =     자식 
//		Student s = (Student) p; // downcasting은 명시해줘야함
//		// 자식    =    (자식) 부모 - 일종의 강제형변환
//		System.out.println(s.name);
		
//		Fruit f1 = new Apple("red",10);
//		f1.show();
		
//		Ipad i1= new Ipad("black",2,12);
//		i1.show();
		
//		pr(new Student()); // person Student
//		//Person p=new Student();
//		System.out.println();
//		pr(new Entertainer()); // person Entertainer
//		//Person p=new Entertainer(); 
//		System.out.println();
//		pr(new Singer()); // person Entertainer Singer
//		//Person p=new Singer();
		
//		A a=new A();
//		B b=new B();
//		
//		a=new A(); //1
//		a=b;//2 (up)
//		b=(B)a;//3(down)
//		b=new B();//4
		
//		A c=new C();
//		System.out.println(c instanceof D); //false
//		System.out.println(c instanceof A); //true
//		System.out.println(new D() instanceof C ); //false
//		System.out.println(new D() instanceof A ); //true
//		A a = new D();
//		System.out.println(a instanceof B); //true
//		System.out.println(new D() instanceof A); //true
//		System.out.println(new C() instanceof A); //true
//		System.out.println(new C() instanceof D); //false                                   
		   
////		1
//		Music m=new Music("ON","BTS");
//		System.out.println(m.title+" "+m.singer);
//		
//		Music m1=new Music("Butter");
//		System.out.println(m1.title+" "+m1.singer);
//		
////		2
//		int a=Cal.add(10,5);
//		int b=Cal.div(10,5);
//		System.out.println(a+" "+b);
		
//		3
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<3-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		4
//		int[][] grade = {{55,60,65},{85,90,95}};
//		int high;
//		high = get(grade);
//		System.out.println("가장높은 점수는 "+high+"입니다");
		
//		5
//		String eng[]= {"student","book","future","note"};
//		String kor[]= {"학생","책","미래","노트"};
//		Scanner sc = new Scanner(System.in);
//		String n;
//		while(true) {
//			n = sc.next();
//			if(n.equals("stop")) {
//				break;
//			}
//			for(int i=0;i<eng.length;i++) {
//				if(n.equals(eng[i])) {
//					System.out.println(kor[i]);
//				}
//			}
//		}
		
//		Cars c = new Cars();
//		c.run();
//		c.stop();
//		Cal c= new Cal();
//		System.out.println(c.add(3,7));//두수합
//		System.out.println(c.avg(new int[]{1,2,3}));
//		                             //1,2,3의 평균  
		
//		Cir c=new Cir(2.5,"circle");
//		c.pr();   //2.5인 circle 출력

//		System.out.println("양수 입력");
//		try {
//			int n=in();
//			System.out.println(n);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		PasswordTest test = new PasswordTest();
//		String password = null;
//		try {
//			test.setPassword(password);
//			System.out.println("오류 없음");
//		} catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
//		password = "abcd";
//		try {
//			test.setPassword(password);
//			System.out.println("오류 없음");
//		} catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
//		password = "abcde";
//		try {
//			test.setPassword(password);
//			System.out.println("오류 없음");
//		} catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
//		password = "abcde1";
//		try {
//			test.setPassword(password);
//			System.out.println("오류 없음");
//		} catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
//	static int in() throws Num {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		if(n<0) {
//			Num num = new Num();
//			throw num;
//		}
//		return n;
//	}
//	static int get(int[][] a){
//		int h= a[0][0];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				if(h<a[i][j]) {
//					h = a[i][j];
//				}
//			}
//		}
//		return h;
//	}
	
}

//추상클래스안에는 일반적인 메소드,추상메소드 둘 다 있을 수 있다
//추상메소드는 반드시 추상클래스 안에 있어야 한다
//abstract class Car{
//	String name; //필드
//	void run() { //일반적인 메소드
//		System.out.println("The car moves");
//	}
//	abstract void stop(); //추상 메소드
//}
//class Cars extends Car{
//	Cars(){
//		name="infinity";
//	}
//	@Override
//	void stop() {
//		System.out.println("The car stops");
//	}
//}
//abstract class Ca{
//	abstract int add(int a,int b);
//	abstract double avg(int a[]);
//}
//class Cal extends Ca{
//	@Override
//	int add(int a, int b) {
//		return a+b;
//	}
//	@Override
//	double avg(int[] a) {
//		double sum =0;
//		for(int i=0;i<a.length;i++) {
//			sum += a[i];
//		}
//		return sum/a.length;
//	}
//}
//class Num extends Exception{
//	Num(){
//		super("Wrong value"); // Exception 부모생성자 호출
//	}
//}
//class Circle{
//	private double r;
//	Circle(double r){
//		this.r=r;
//	}
//	double get() {
//		return r;
//	}
//}
//class Cir extends Circle{
//	String name;
//	Cir(double r) {
//		super(r);
//	}
//	Cir(double r,String n){
//		super(r);
//		this.name=n;
//	}
//	void pr() {
//		System.out.println(get()+" "+name);
//	}
//}
//class PasswordException extends Exception{
//	PasswordException(String msg){
//		super(msg);
//	}
//}
//class PasswordTest{
//	String password;
//	String getPassword(){
//		return password;
//	}
//	String setPassword(String password) throws PasswordException{
//		if(password == null) {
//			throw new PasswordException("null");
//		}
//		if(password.length()<5) {
//			throw new PasswordException("5 more character");
//		}
//		if(password.matches("[a-zA-Z]+")) {
//			throw new PasswordException("Include number");
//		}
//		return this.password = password;
//	}
//}