//class Color{
//	
//	String a;
//	String b="black";
//		
//	Color(String a){
//		this.a=a; //매개변수값을 필드에 대입(초기화)
//	}
//	
//	Color(String a, String b){
//		this.a = a; 
//		this.b = b;
//	}
//	
//	void show() {
//		System.out.println(a + ", "+ b);
//	}
//}
//class Rec{
//	int a;
//	int b;
//	
//	Rec(int a, int b){
//		this.a=a;
//		this.b=b;
//	}
//	
//	void area() {
//		System.out.println(a*b);
//	}
//}

//class Book{
//	String name;
//	String author;
//	
//	Book(String name){
//		this.name = name;
//		author = "작자미상";
//	}
//	
//	Book(String name,String author){
//		this.name = name;
//		this.author = author;
//	}
//	
//}
public class Classeleven {

//	int r;
//	String name;
//	
//	public double area() {
//		return 3.14*r*r;
//	}
	
//	int r;
//	String name;
//	
//	Classeleven(){//생성자 오버로드
//		r =1;
//		name="";
//	}
//	
//	Classeleven(int r,String name){//생성자 오버로드
//		this.r=r;					//메서드이름은 같은데 변수만 다름
//		this.name=name;
//	}
//	
//	
//	public double area() {
//		return 3.14*r*r;
//	}
	
	public static void main(String[] args) {
		
//		Color c1 = new Color("용학"); //매개변수가 1개인 생성자
//		Color c2 = new Color("송이","red"); //매개변수가 2개인 생성자
//		
//		c1.show();
//		c2.show();
		
//		Rec r1=new Rec(4,7);
//		Rec r2=new Rec(7,9);
//		
//		r1.area(); //4*7
//		r2.area(); //7*9
		
//		Order order = new Order();
//		order.orderNumber = 202205190001L;
//		order.orderId = "abc123";
//		order.orderDate = "2022년 05월 19일";
//		order.name = "홍길순";
//		order.orderObjectNumber = "PD0345-12";
//		order.address = "서울시 영등포구 여의도동 20번지";
//		
//		System.out.println("주문 번호 : "+order.orderNumber);
//		System.out.println("주문자 아이디 : "+order.orderId);
//		System.out.println("주문 날짜 : "+order.orderDate);
//		System.out.println("주문자 이름 : "+order.name);
//		System.out.println("주문 상품 번호: "+order.orderObjectNumber);
//		System.out.println("배송 주소 : "+order.address);
		
//		Classeleven t = new Classeleven();
//		t.r = 10;
//		t.name = "java";
//		
//		double area = t.area();
//		System.out.println(t.name + " "+area);
		
//		Classeleven t = new Classeleven(10,"java");
//		System.out.println(t.name + " "+t.area());
//		
//		Classeleven t2 = new Classeleven();
//		t2.name = "db";
//		System.out.println(t2.name + " "+t2.area());
		
//		Book b1 = new Book("개미","베르나르");
//		Book b2 = new Book("두 도시 이야기");
		
//		Number n = new Number(5);
//		System.out.println(n.n);
		
//		Book b1 = new Book("나무",30000);
//		Book b2 = new Book("총균쇠");
//		Book b3 = new Book();
//		b1.show();
//		b2.show();
//		b3.show();
		
		/*
		 *  this() 를 사용하는 생성자는 
		 *  this()가 생성자의 첫번째로 사용되야함
		 *  
		 *  this()는 반드시 같은 클래스의 다른 생성자를 
		 *  호출할때 사용된다
		 *  
		 *  this()는 생성자에서만 사용된다
		 */ 
		
//		A a1 = new A();
//		A a2 = new A();
//		A a3 = new A();
		
//		A a = new A();
//		a.num++;
//		A.num++;
//		System.out.println(A.num);
		
//		Circle c = new Circle(3.4);
//		c.show();
//		c.area();
		
//		Number.show(30);
		
		/*
		 * static 멤버는 클래스당 한번만 생성
		 * 동일한 클래스이 모든 객체들이 공유한다
		 * 
		 * 인스턴스변수는 각 객체마다 별도로 생긴다
		 */
		
//		System.out.println(Cal.max(10,7));
//		System.out.println(Cal.min(4,-2));
		
//		XY x=new XY();
//		x.set(4,8);
//		x.show();
//		
//		XYZ y =new XYZ();
//		y.set(6,8);
//		y.setname("xyz");
//		y.pr();
		
//		Student s1 = new Student();
//		s1.name="민훈";
//		s1.job="IT";
		
//		Human h = new Human(); //부모클래스 생성
//		h.name = "tomas";
//		h.age = 30;
//		h.show();
//		//h.subject(); 
//		//h.pr();
//		//부모class는 자식class 의 변수, 메소드에 접근안됨
//		Student s = new Student();
//		s.name = "steve";
//		s.age = 20;
//		s.show();
//		s.subject = "IT";
//		s.pr();
		
	}
}

//class Student extends Human{
//	String subject;
//	 //자식클래스에 추가되는 인스턴스변수(name,age,show())그대로 물려받음
//	void pr() {
//		show();
//		System.out.println(subject);
//	}
//}
//
//class Human{
//	String name;
//	int age;
//	
//	void show() {
//		System.out.println(name + " " + age);
//	}
//}

//class Man{
//	String name;
//	void name() {
//		System.out.println(name);
//	}
//}
//class Student extends Man{
//	String job;
//	String address;	
//}

//class Student{
//	String name;
//	String job;
//	String address;
//	
//	Student(String name,String job,String address){
//		this.name = name;
//		this.job = job;
//		this.address = address;
//	}
//	
//	void name() {
//		System.out.println(name);
//	}
//	
//	void info() {
//		System.out.println(job+ " " + address);
//	}
//	
//}
//class XYZ extends XY{ //XY를 상속받은 XYZ클래스
//	private String name;
//
//	void setname(String a) {
//		this.name = a;
//	}
//	void pr() {
//		show();
//		System.out.println(name);
//	}
//}
//
//class XY{
//	private int x,y;
//	
//	void set(int a,int b) {
//		this.x = a;
//		this.y = b;
//	}
//	
//	void show() {
//		System.out.println(x+" "+y);
//	}
//}

//class Cal{
//	static int max(int a,int b) {
//		return a>b? a:b; 
//	}
//	static int min(int a,int b) {
//		return a<b? a:b;
//	}
//}

//class Number{
//	static void show(int a) { //static을 포함한 함수
//		System.out.println(a);//클래스메서드(정적메서드)
//	}
//	//클래스메서드는 클래스에서 직접 접근이 가능(인스턴스생성X)
//	static void sh(double n) {//static 메서드가 객체보다
//		System.out.println(n);//먼저 생성되기 때문에 가능하다
//	}
//}
//class Circle{
//	private double a;
//	static final double PI=3.14; //final:변경되는 값이 아님
//	Circle(double a){
//		this.a=a;
//	}
//	
//	void show() {
//		System.out.println(a*2*PI);//원둘레
//	}
//	
//	void area() {
//		System.out.println(PI*a*a);//원넓이
//	}
//}
//class A{
//	static int num = 0;
//	A(){
//		in();
//	}
//	
//	public void in() {
//		num++;
//	}
//}

//class A{// static 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수
//	static int a=100;
//	A(){
//		a++;
//		System.out.println(a);
//	}
//	
//}

//class Book{
//	String name;
//	int price;
//	
//	Book(String name){
//		this(name,0); //다른생성자 호출
//	}
//	
//	Book(String name,int price){
//		this.name = name;
//		this.price = price;
//	}
//	
//	Book(){
//		this("",0);
//		System.out.println("생성자 호출");
//	}
//	
//	void show() {
//		System.out.println(name + " " + price);
//	}
//}
//class Number{
//	int n;
//	Number(int n){
//		this.n=n;
//	}
	

//class Order{
//	Long orderNumber;//12자리이므로Long 
//    //int 범위:  –2,147,483,648 ~ 2,147,483,647
//	String orderId;
//	String orderDate;
//	String name;
//	String orderObjectNumber;
//	String address;
//}