<<<<<<< HEAD
package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
				System.out.println("read");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} finally {
				if(fis != null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				System.out.println("pass");
			}
			System.out.println("end");
	}

}
=======
package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
				System.out.println("read");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} finally {
				if(fis != null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				System.out.println("pass");
			}
			System.out.println("end");
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
