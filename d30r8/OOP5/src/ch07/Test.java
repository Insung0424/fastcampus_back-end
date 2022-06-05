package ch07;

public class Test {

	public static void main(String[] args) {
		TPrinter<Powder> tp = new TPrinter<>();
		tp.setMaterial(new Powder());
		System.out.println(tp);
		
		TPrinter<Plastic> tpl = new TPrinter<>();
		tpl.setMaterial(new Plastic());
		System.out.println(tpl);
		
		
		
	}

}
