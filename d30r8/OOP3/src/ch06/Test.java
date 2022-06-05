package ch06;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Customer> cl = new ArrayList<>();
		Customer ct = new Customer(10010,"t");
		Customer cj = new Customer(10020,"j");
		Customer ce = new gold(10030,"e");
		Customer cp = new gold(10040,"p");
		Customer ck = new Vip(10050,"k");
		
		cl.add(ct);
		cl.add(cj);
		cl.add(ce);
		cl.add(cp);
		cl.add(ck);
		
//		for(Customer s : cl) {
//			System.out.println(s);
//		}
		
		int price = 10000;
		for(Customer s:cl) {
			int cost = s.calcPrice(price);
			System.out.println(s.getcName()+" "+cost);
			System.out.println(s.getcName()+" "+s.bonus);
		}
		
	}

}
