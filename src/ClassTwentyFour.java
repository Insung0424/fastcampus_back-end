import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Person{
	int id;
	String name;
	public Person(String name,int id) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return name+" : "+id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

public class ClassTwentyFour extends JFrame{
//	int n = 0;
//	int m = 0;
//	ClassTwentyFour(){
//		Container c = getContentPane();
//	      c.setLayout(null);
//
//	      JButton jb1 = new JButton("아메리카노");
//	      jb1.setBounds(50, 50, 100, 100);
//	      JLabel jl1 = new JLabel("5000원");
//	      jl1.setBounds(75, 150, 100, 50);
//	      JButton p1 = new JButton("+");
//	      p1.setBounds(50, 200, 20, 20);
//	      JTextField jt1 = new JTextField(5);
//	      jt1.setBounds(75, 200, 50, 20);
//	      JButton m1 = new JButton("-");
//	      m1.setBounds(130, 200, 20, 20);
//	      JButton j1 = new JButton("확인");
//	      j1.setBounds(50, 250, 100, 30);
//	      JLabel jj1 = new JLabel(" ");
//	      jj1.setBounds(75, 300, 50, 50);
//	      JButton jb2 = new JButton("  카페라떼  ");
//	      jb2.setBounds(200, 50, 100, 100);
//	      JLabel jl2 = new JLabel("5500원");
//	      jl2.setBounds(225, 150, 100, 50);
//	      JButton p2 = new JButton("+");
//	      p2.setBounds(200, 200, 20, 20);
//	      JTextField jt2 = new JTextField(5);
//	      jt2.setBounds(225, 200, 50, 20);
//	      JButton m2 = new JButton("-");
//	      m2.setBounds(280, 200, 20, 20);
//	      JButton j2 = new JButton("확인");
//	      j2.setBounds(200, 250, 100, 30);
//	      JLabel jj2 = new JLabel(" ");
//	      jj2.setBounds(225, 300, 50, 50);
//	      JButton jb3 = new JButton("  카푸치노  ");
//	      jb3.setBounds(350, 50, 100, 100);
//	      JLabel jl3 = new JLabel("6000원");
//	      jl3.setBounds(375, 150, 100, 50);
//	      JButton p3 = new JButton("+");
//	      p3.setBounds(350, 200, 20, 20);
//	      JTextField jt3 = new JTextField(5);
//	      jt3.setBounds(375, 200, 50, 20);
//	      JButton m3 = new JButton("-");
//	      m3.setBounds(430, 200, 20, 20);
//	      JButton j3 = new JButton("확인");
//	      j3.setBounds(350, 250, 100, 30);
//	      JLabel jj3 = new JLabel(" ");
//	      jj3.setBounds(375, 300, 50, 50);
//	      
//	      jb1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				jt1.setText(Integer.toString(n));
//				jb1.setEnabled(false);
//			}
//	      });
//	      p1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					jt1.setText(Integer.toString(++n));
//				}
//		  });
//	      m1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					jt1.setText(Integer.toString(--n));
//				}
//		  });
//	      j1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					jj1.setText(5000*n+"원");
//				}
//		  });
//
//	      c.add(jb1);
//	      c.add(jl1);
//	      c.add(p1);
//	      c.add(jt1);
//	      c.add(m1);
//	      c.add(j1);
//	      c.add(jj1);
//	      c.add(jb2);
//	      c.add(jl2);
//	      c.add(p2);
//	      c.add(jt2);
//	      c.add(m2);
//	      c.add(j2);
//	      c.add(jj2);
//	      c.add(jb3);
//	      c.add(jl3);
//	      c.add(p3);
//	      c.add(jt3);
//	      c.add(m3);
//	      c.add(j3);
//	      c.add(jj3);
//	      setSize(520,800);
//	      setVisible(true);
//	      setDefaultCloseOperation(EXIT_ON_CLOSE);
//	   }
	
	

	public static void main(String[] args) {
//		new ClassTwentyFour();
		
//		Person []par = new Person[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<par.length;i++) {
//			String b = sc.next();
//			int a = sc.nextInt();
//			par[i] = new Person(b,a);
//		}
//		for(Person s : par) {
//			System.out.println(s);
//		}
//		
//		HashMap<String,Integer> hm = new HashMap<>();
//		for(Person p:par) {
//			hm.put(p.getName(), p.getId());
//		}
//		
//		while(true) {
//			System.out.println("이름?");
//			String s = sc.next();
//			if(s.equals("stop")) {
//					break;
//			}
//			if(hm.containsKey(s)) {
//				System.out.println(hm.get(s));
//			}
//			else {
//				System.out.println("none");
//			}
//		}
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		for(int i=0;i<5;i++) {
//			arr.add((int)(Math.random()*11));
//		}
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
//		Map<String,Integer> map = new HashMap();
////		map.put("A", 100);
//		map.put("B", 101);
//		map.put("C", 102);
//		map.put("C", 103);
//		if(!map.containsKey("A")) {
//			map.put("A", 300);
//		}
//		System.out.println(map);
//		System.out.println("A " +map.get("A"));
		
//		if(2>3) 
//			System.out.println(15); //중괄호는 한문장일때 생략가능
//			System.out.println(30); //같은 들여쓰기를 해도 따로 취급
		
//		HashSet<AA> c = new HashSet<>();
//		c.add(new AA("10"));
//		c.add(new AA("20"));
//		c.add(new AA("10"));
//		Iterator<AA> it = c.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		AA<String> a = new AA<String>("a");
//		System.out.println(a.tt());
		
	}
}

//class AA<T>{
//	T s;
//	AA(T s){
//		this.s = s;
//	}
//	T tt() {
//		return s;
//	}
//}

//class AA{
//	String a;
//	public AA(String a) {
//		this.a = a;
//	}
//	public int hashCode() {
//		return Integer.parseInt(a);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		AA aa = (AA) obj;
//		if(aa.a == this.a) {
//			return true;
//		}
//		return false;
//	}
//	public String toString() {
//		return a;
//	}
//}