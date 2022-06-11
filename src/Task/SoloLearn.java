package Task;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



//class Th extends Thread{
//	JLabel a;
//	Th(JLabel a){
//		this.a=a;
//	}
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			try {
//				a.setText(i+"");
//				sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}


//public class SoloLearn extends JFrame{
//	
//		SoloLearn(){
//		
//		Container c=getContentPane();
//		JPanel j1=new JPanel();
//		JPanel j2=new JPanel();
//		JPanel j3=new JPanel();
//		
//		j1.setBackground(Color.pink);
//		j2.setLayout(new GridLayout(4,4));
//		j3.setBackground(Color.yellow);
//		
//		c.add(j1, BorderLayout.NORTH); //프레임에 파넬부착
//		c.add(j2);
//		c.add(j3, BorderLayout.SOUTH);
//		
//		JLabel jl=new JLabel("입력");
//		JTextField jf=new JTextField(10);
//		
//		j1.add(jl);
//		j1.add(jf);
//		
//		JLabel ja=new JLabel("결과");
//		JTextField jt=new JTextField(10);
//		
//		j3.add(ja);
//		j3.add(jt);
//		
//		for(int i=0;i<16;i++) {
//			JButton b=new JButton();
//			String s[]= {"+","-","*","/","계산","CE"};
//			j2.add(b);
//			
//			if(i<10) {
//				b.setText(Integer.toString(i));
//			}
//			else { //10~15
//				b.setText(s[i-10]);
//			}
//		}	
//		setSize(600,600);
//		setVisible(true);
//	}
//	SoloLearn(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JLabel j = new JLabel();
//		c.add(j);
//
//		Th t = new Th(j); // 쓰레드객체생성
//		setSize(300,300);
//		setVisible(true);
//		t.start(); // 쓰레드실행
//	}

	public static void main(String[] args) throws IOException {
		new SoloLearn();
		
		//		System.out.printf("%.1f", 10.0/4);
		
//		int i=1;
//		int sum=0;
//		while(true) {
//			if(i>100) {
//				break;
//			}
//			if(i%5 == 0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
//		for(int i=1; ;i++) {
//			if(i>30){
//				break;
//			}
//			if(i%5 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		int result = adder(10,20);
//		System.out.println(result);
//		System.out.println(exp(3.5));
		
//		Circle a=new Circle(30);
//		Circle b=new Circle(30);
//		System.out.println("반지름"+a);
//		System.out.println("반지름"+b);
//		if(a.equals(b)) {
//		System.out.println("같은 원"); 
//		}
//		else {
//		System.out.println("다른 원");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		FileWriter in = new FileWriter("test.txt");
//		while(true) {
//			String name = sc.next();
//			if(name.equalsIgnoreCase("stop")) {
//				break;
//			}
//			in.write(name);
//			String id = sc.next();
//			if(id.equalsIgnoreCase("stop")) {
//				break;
//			}
//			in.write(id+"\n");
//		}
//		in.close();
		
//		Tv1 t=new Tv1(20, "삼성");
//		t.show();
		
//		Point p = new Point(3,4);
//		System.out.println(p); 
		
//		Re r=new Rec(10,20);
//		r.show(); //"사각형!!" 출력
//		System.out.println("면적" + r.area());
		
//		Book b1=new Book("멋진 신세계", "올더스 헉슬리");
//		Book b2=new Book("더 해빙");
//		Book b3=new Book(); 
		
//		String f = Boolean.toString(false);
//		System.out.println(f);
//		double d = Double.parseDouble("36.5");
//		System.out.println(d);
//		int i = Integer.parseInt("35");
//		System.out.println(i);
		
//		Ab c=new Cd();
//		System.out.println(c.total(new int []{1,2,3,4,5}));
		
////		int[][] arr = new int[3][3];
////		System.out.println(high(arr,3,3));
//	}
//	static int high(int[][] arr,int a,int b) {
//		int max = arr[0][0];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(arr[i][j] > max) {
//					max = arr[i][j];
//				}
//			}
//		}
//		return max;
//	}
		
//		FileOutputStream out = new FileOutputStream("fi.txt");
//		byte[] b = {1,2,3,4,5};
//		out.write(b);
//		out.close();
//		FileInputStream in = new FileInputStream("fi.txt");
//		int i;
//		while((i = in.read()) != -1) {
//			System.out.println(i);
//		}
		
//		HashMap<String,Integer> m = new HashMap<>();
//		m.put("hong", 11);
//		m.put("hon", 22);
//		m.put("ho", 33);
//		Iterator<String> it = m.keySet().iterator();
//		while(it.hasNext()) {
//			String a =it.next();
//			if(a.equals("hong")) {
//				System.out.println(m.get(a));
//			}
//		}
		
//		 int ary[];
//		 ary=make();
//		 for(int i=0;i<ary.length;i++){
//			 System.out.println(ary[i]);
//		 }
		
//		Set<Person> s=new HashSet<Person>();
//		s.add(new Person(12, "홍길동"));
//		s.add(new Person(23, "김길동"));
//		s.add(new Person(12, "이길동"));
//		Iterator<Person> it=s.iterator();
//		while(it.hasNext()){
//			Person p=it.next();
//			System.out.println(p.num + " " + p.name);
//		}
		
//		int a[]={1,2,3,4,5};
//		int b[]={6,7,8,9,10};
//
//		int c=add(a,5);
//		int d=add(a,5,b);
//
//		System.out.println(c);
//		System.out.println(d);
//		
//	}
//	static int add(int[] a,int b) {
//		int sum=0;
//		for(int i:a) {
//			sum+=i;
//		}
//		return sum;
//	}
//	static int add(int[] a,int b,int[] c) {
//		int sum=0;
//		for(int i:c) {
//			sum+=i;
//		}
//		return sum+add(a,b);
//	}
//}
		
//		   Thread th1=new MovieThread();
//		   th1.start();
//		   Thread th2=new Thread(new MusicThread());
//		   th2.start();
		
//		String s = "1+2+3+4+5";
//		StringTokenizer st = new StringTokenizer(s,"+");
//		int sum=0;
//		while(st.hasMoreTokens()) {
//			sum+=Integer.parseInt(st.nextToken());
//		}
//		System.out.println(sum);
		
		
	}
}


//class MovieThread extends Thread{
//	@Override
//	public void run() {
//		for(int i=0;i<3;i++) {
//			System.out.println("영화");
//		}
//	}
//}
//class MusicThread implements Runnable{
//	@Override
//	public void run() {
//		for(int i=0;i<3;i++) {
//			System.out.println("음악");
//		}
//	}
//}
//class Person{
//	int num;
//	String name;
//	Person(int a,String b){
//		this.num=a;
//		this.name=b;
//	}
//	@Override
//	public int hashCode() {
//		return num;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		if(this.num == p.num) {
//			return true;
//		}
//		return false;
//	}
//}
//	static int[] make() {
//		int[] arr = {1,2,3,4,5};
//		return arr;
//	}
//}


//class Calcclass{
//	int sum = 0;
//	int calculate(int n) {
//		for(int i=1;i<=n;i++) {
//			if(i%2 == 1) {
//				sum+=i;
//			}
//		}
//		return sum;
//	}
//}

//abstract class Ab{
//	public abstract int total(int[] a);
//}
//class Cd extends Ab{
//	public int total(int[] a) {
//		int sum=0;
//		for(int i:a) {
//			sum+=i;
//		}
//		return sum;
//	}
//}

//class Book{
//	String a,b;
//	Book(){
//		this("생성자호출","");
//	}
//	Book(String a){
//		this(a,"작가미상");
//	}
//	Book(String a, String b){
//		this.a=a;
//		this.b=b;
//		System.out.println(a+" "+b);
//	}
//}

//interface Re{
//	default void show() {
//		System.out.println("사각형");
//	}
//	public int area();
//}
//class Rec implements Re{
//	int a,b;
//	Rec(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public int area() {
//		return a*b;
//	}
//}

//class Point {
//	int a,b;
//	Point(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public String toString() {
//		return a+"."+b;
//	}
//}
// 스태틱
//	static int adder(int a,int b) {
//		return a+b;
//	}
//	static double exp(double a) {
//		return a*a;
//	}
//스태틱	

//class Tv {
//	private int size;
//	Tv(int size) {
//		this.size = size;
//	}
//	protected int getsize() {
//		return size;
//	}
//}
//class Tv1 extends Tv{
//	String a;
//	Tv1(int size,String a) {
//		super(size);
//		this.a=a;
//	}
//	public void show() {
//		System.out.println(a + " : " +getsize());
//	}
//}
//class Circle{
//	int a;
//	Circle(int a){
//		this.a=a;
//	}
//	public String toString() {
//		return a+"";
//	}
//	@Override
//	public int hashCode() {
//		return a;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Circle c = (Circle) obj;
//		if(this.a == c.a) {
//			return true;
//		}
//		return false;
//	}
//}