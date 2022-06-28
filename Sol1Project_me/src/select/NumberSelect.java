package select;

import java.util.Random;

public class NumberSelect {
	
	public static void main(String[] args) {
		Random random = new Random();
		int com[] = new int[6];
		
		for(int i=0;i<6;i++) {
			com[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
				}
			}
		}
		
		for(int i: com)
			System.out.println(i);
		
	}
}
