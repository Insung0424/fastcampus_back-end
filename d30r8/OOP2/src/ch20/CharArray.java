package ch20;

public class CharArray {

	public static void main(String[] args) {
		char[] al=new char[26];
		
		char ch = 'A';
		
		for(int i=0;i<al.length;i++) {
			al[i] = ch ++;
		}
		
		for(char a:al) {
			System.out.println(a + " " + (int)a);
		}
	}

}
