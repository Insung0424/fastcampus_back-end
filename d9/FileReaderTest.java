<<<<<<< HEAD
package ch15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
			

			try(FileReader fr = new FileReader("reader.txt")) {
				int i;
				while( (i = fr.read()) != -1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				
			}
			
	}

}
=======
package ch15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
			

			try(FileReader fr = new FileReader("reader.txt")) {
				int i;
				while( (i = fr.read()) != -1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				
			}
			
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
