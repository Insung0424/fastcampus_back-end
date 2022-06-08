import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

//class Fruit{
//	void fruit() {
//		System.out.println("과일");
//	}
//}
//class Apple extends Fruit{
//	void apple() {
//		System.out.println("사과");
//	}
//}
//class PineApple extends Apple{
//	void pineapple() {
//		System.out.println("파인애플");
//	}
//}
//class PhoneNum{
//	String name;
//	String phone;
//	PhoneNum(String name,String phone){
//		this.name=name;
//		this.phone=phone;
//	}
//	void show() {
//		System.out.println("이름 "+name);
//		System.out.println("번호 "+phone);
//	}
//}
//class School extends PhoneNum{
//	String major;
//	School(String name,String phone,String major){
//		super(name,phone);
//		this.major = major;
//	}
//	void show() {//오버라이딩
//		super.show();
//		System.out.println("전공 "+major);
//	}
//}
//class Worker extends PhoneNum{
//	String grade;
//	Worker(String name,String phone,String grade){
//		super(name,phone);
//		this.grade=grade;
//	}
//	void show() {
//		super.show();
//		System.out.println("직급 "+grade);
//	}
//}
//class Arr{
//	PhoneNum [] arr;
//	int r;
//	Arr(int r){
//		arr = new PhoneNum [r];//객체배열생성
//		r=0;//인덱스를 위해 0으로 초기화
//	}
//	void add(PhoneNum p) {
//		arr[r++]=p; // 배열에 객체를 추가하고나서 r값증가
//	}
//	
//	void all() {
//		for(int i=0;i<arr.length;i++) {
//			arr[i].show();
//		}	
//	}
//	void friend(char c) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 ");
//		String name=sc.next();
//		System.out.println("번호 ");
//		String phone=sc.next();
//		switch(c) {
//		case 'A':
//			System.out.println("전공 ");
//			String major=sc.next();
//			add(new School(name,phone,major)); // 생성자
//			break;
//		case 'B':
//			System.out.println("직급 ");
//			String grade=sc.next();
//			add(new Worker(name,phone,grade));
//			break;
//		}
//	}
//
//}
//class Th extends Thread{
//	String name;
//	Th(String name){
//		this.name=name;
//	}
//	@Override
//	public void run() { //스레드 실행 (메인)메소드(스레드코드) 반드시 있어야함
////		System.out.println(name);
//		for(int i=0;i<10;i++) {
//			System.out.println(name);
//			try {
//				sleep(100);
//			}catch(Exception e) {}
//		}
//	}
//	
//}
//class Th implements Runnable{
//	String name;
//	Th(String name){
//		this.name=name;
//	}
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(name);
//			try {
//				Thread.sleep(100); //인터페이스에서 run을 오버라이딩
//				//Thread 클래스를 작성
//			}catch(Exception e) {}
//		}
//	}
//}
//class Music extends Thread{
//	String n;
//	Music(String s){
//		n=s;
//	}
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(n);
//		}
//	}
//}
//class Movie implements Runnable{
//	String a;
//	Movie(String b){
//		a=b;
//	}
//	public void run() {
//		System.out.println(a);
//	}
//}
//class Th implements Runnable{
//	
//	public void th1() {
//		System.out.println("BB");
//		th2();
//	}
//	public void th2() {
//		System.out.println("CC");
//	}
//
//	public void run() {
//		System.out.println("AA");
//		th1();
//	}	
//}
//class Th extends Thread{
//	String w;
//	Th(String a,int n){
//		w=a;
//		setPriority(n);//스레드 우선 순위 셋팅
//	}
//	public void run() {
//		System.out.println(w);
//		System.out.println(getPriority());
//	}
//}
//class Share{
//	void pr(String s) {
//		for(int i=0;i<s.length();i++) {
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//	}
//}
//class Tt1 extends Thread{
//	String []arr;
//	Share s;
//	Tt1(Share s,String []arr){
//		this.arr = arr;
//		this.s = s;
//	}
//	public void run() {
//		for(int i=0;i<arr.length;i++) {
//			s.pr(arr[i]);
//		}
//	}
//}
public class ClassSixteen {
//	static void pr(Fruit f) {
//		if(f instanceof PineApple) {
//			((PineApple) f).pineapple(); //부모는 자식함수에 접근x
//			//downcasting 해줘야함
//		}
//		else if(f instanceof Apple) {
//			((Apple) f).apple();
//		}
//		else {
//			f.fruit();
//		}
//	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Fruit f=new Fruit();
//		Apple a=new Apple();
//		PineApple p=new PineApple();
//		pr(f);
//		pr(a);
//		pr(p);
		
//		Arr ar = new Arr(5);
//		while(true) {
//			System.out.println("A.학교 친구 정보");
//			System.out.println("B.학교 친구 정보");
//			System.out.println("C.종료");
//			System.out.println("D.출력");
//			System.out.println("문자 입력");
//			Scanner sc=new Scanner(System.in);
//			char c = sc.next().charAt(0);
//			switch(c) {
//			case 'A':
//				ar.friend(c);
//				break;
//			case 'B':
//				ar.friend(c);
//				break;
//			case 'C':
//				System.out.println("종료");
//				return; //반환값없는 리턴은 함수 종료 
//			case 'D':
//				ar.all();
//			}//switch
//			
//		}//while
	
//		Th t1 = new Th("스레드1");
//		Th t2 = new Th("스레드2");
//		//Thread th1=new Thread(t1);
//		new Thread(t1).start();// run(); 을 호출
//		new Thread(t2).start();//스레드 작동 시작(JVM에의해 스케줄되기 시작함)
//		// 호출순서는 디폴트 랜덤
		
//		Music m=new Music("재생");
//		m.start(); //10번 출력
//		Movie mv = new Movie("영화");
//		Thread t = new Thread(mv);
//		t.start(); //1번 출력
//		
//		try {
//			m.join(); // join : 해당 스레드가 종료되길 기다림
//			t.join();
//		}catch(Exception e) {}
		
//		System.out.println("thread");
//		Th t = new Th();
//		Thread t1 = new Thread(t);
//		t1.start();
//		try {
//			t1.join();
//		}catch(Exception e) {}
//		System.out.println("end");
////join 으로 제어 하지 않았을 때 / join으로 제어했을 때
////		thread 					thread
////		end    					AA
////		AA						BB		
////		BB						CC
////		CC						end  
		
//		Th t1 =new Th("tom",Thread.MAX_PRIORITY);
//									//우선순위
//		Th t2 =new Th("lee",Thread.MIN_PRIORITY);
//		Th t3 =new Th("kim",Thread.NORM_PRIORITY);
//		
//		t1.start(); //join 이 없으면 우선순위를 따르지 않는경우도 발생
//		t2.start();
//		t3.start();
		
//		Share s = new Share();
//		String eng[]= {"java","python","Jsp","Ruby","C#"};
//		String kor[]= {"자바","파이썬","제이에스피","루비","씨샵"};
//		Tt1 t1=new Tt1(s,eng); //상속
//		Thread t2 = new Tt1(s,kor); //up
//		t1.start();
//		t2.start();
		
//		1
//		Book b1=new Book("멋진 신세계", "올더스 헉슬리");
//		Book b2=new Book("더 해빙");
//		Book b3=new Book();
		
//		2
//		ITFriend it=new ITFriend("홍길동","010-111-1111","컴퓨터");
//	    it.show();
		
//		3
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			try {
//				sum+=sc.nextInt();
//			}catch(Exception e) {
//				sc.next();
//				i--;
//				continue;
//			}
//		}
//		System.out.println(sum);
		
////		4
//		Double a = new Double(9.5);
//		//Double a = 9.5; //autoBoxing
////		4-1
//		String s = Double.toString(a);
//		//String s = a.toString();
////		4-2
//		double d = Double.parseDouble(s);
//		//double d = a.doubleValue();
		
////		5
//		Circle a = new Circle(30);
//		Circle b = new Circle(30);
//		System.out.println("반지름 " + a);
//		System.out.println("반지름 " + b);
//		if (a.equals(b)) {
//			System.out.println("같은 원");
//		}
//		else {
//			System.out.println("다른 원");
//		}
		
//		6
//		Po p = new Point();
//		p.pr(30000, "java");
//		p.pr("python");
		
		
//		ObjectOutputStream obp = null;
//		obp = new ObjectOutputStream(new FileOutputStream("obj.txt"));
//		//객체를 파일에 저장 : 직렬화
//		obp.writeObject(new Rec(4,7)); //객체저장
//		obp.writeObject(new Rec(8,5));
//		obp.writeObject(new String("glgl"));
//
//		obp.close();
		
//		ObjectInputStream obi = new ObjectInputStream(new FileInputStream("obj.txt"));
//		//파일에 저장한 객체를 읽어옴: 역직렬화
//		Rec r1 = (Rec) obi.readObject(); //객체를 읽어오므로 다운캐스팅
//		Rec r2 = (Rec) obi.readObject(); //객체를 읽어오므로 다운캐스팅
//		String r3 = (String) obi.readObject(); //객체를 읽어오므로 다운캐스팅
//		
//		//객체를 이용해 출력함수에 접근
//		r1.show();
//		r2.show();
//		System.out.println(r3); //string이므로 그냥 출력
//		
//		obi.close();
		
	}

}
//class Rec implements Serializable{ 
//	//implements Serializable 없이 run 실행시 error
//	int i,j;
//	Rec(int a,int b){
//		i=a;
//		j=b;
//	}
//	void show() {
//		System.out.println(i+" "+j);
//	}
//}
//interface Po{
//	public void pr(String s);
//	public void pr(int i,String s);
//}
//class Point implements Po{
//	public void pr(int i,String s) {
//		System.out.println(s+" 책은 "+i+"원");
//	}
//	public void pr(String s) {
//		System.out.println(s);
//	}
//}
//class Circle{
//	int r;
//	Circle(int r){
//		this.r=r;
//	}
//	public String toString() {
////		return String.valueOf(r);
//		return r+"";
//	}
////	@Override
////	public boolean equals(Object obj) {
////		if(obj instanceof Circle) {
////			Circle c = (Circle) obj;
////			if(this.r == c.r) {
////				return true;
////			}
////			else {
////				return false;
////			}
////		}
////		return false;
////	}
//	public boolean equals(Circle c) {
//		if(this.r == c.r) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//class Friend {
//	private String name;
//	private String phone;
//	Friend(String name, String phone) {
//		this.name = name;
//		this.phone = phone;
//	}
//	String get() {
//		return name + " " + phone;
//	}
//}
//class ITFriend extends Friend{
//	private String device;
//	ITFriend(String name,String phone,String device){
//		super(name,phone);
//		this.device=device;
//	}
//	public void show() {
//		System.out.println(this.device
//				+" "
//				+super.get().substring(0,3)
//				+" 번호 "
//				+super.get().substring(4));
//	}
//}
//class Book{
//	String title;
//	String author;
//	Book(){
//		System.out.println("생성자 호출!");
//	}
//	Book(String title){
//		this(title,"작가 미상");
//	}
//	Book(String title,String author){
//		this.title=title;
//		this.author=author;
//		System.out.println(title+ " " + author);
//	}
//}