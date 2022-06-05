<<<<<<< HEAD
package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
			
		Powder powder = new Powder();
		ThreeDPrinter4 printer = new ThreeDPrinter4();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
		System.out.println(printer);
	}

}
=======
package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
			
		Powder powder = new Powder();
		ThreeDPrinter4 printer = new ThreeDPrinter4();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
		System.out.println(printer);
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
