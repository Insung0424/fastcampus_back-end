package ch16;

import java.io.IOException;
import java.util.Scanner;

public class CallTest {

	public static void main(String[] args) throws IOException {
		System.out.println("choose");
		System.out.println("R");
		System.out.println("L");
		System.out.println("P");

		Scheduler shc=null;
		int s = System.in.read();
		if(s=='R' || s=='r') {
			shc = new RoundRobin();
		}
		else if(s=='L' || s=='l') {
			shc = new Leastjob();
		}
		else if(s=='P' || s=='p') {
			shc = new PA();
		}
		else {
			System.out.println("wrong");
			return;
		}
		shc.getNextCall();
		shc.sendCallToAgent();
		
	}

}
