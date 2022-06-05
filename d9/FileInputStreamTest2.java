<<<<<<< HEAD
package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			while( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e){
			System.out.println(e);
		}
		
		
	}

}
=======
package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			while( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e){
			System.out.println(e);
		}
		
		
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
