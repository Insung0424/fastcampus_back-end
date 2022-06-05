<<<<<<< HEAD
package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

			Coffee ethiCoffee = new EthiopiaAmericano();
			ethiCoffee.brewing();
			
			System.out.println();
			Coffee ethiLatte= new Latte(ethiCoffee);
			ethiLatte.brewing();
			
			System.out.println();
			Coffee ethiMocha = new Mocha(new Latte(new EthiopiaAmericano()));
			ethiMocha.brewing();
			
			System.out.println();
			Coffee keyacoffee = new WhippingCream(new Mocha(new KeyaAmericano()));
			keyacoffee.brewing();																	
	}

}
=======
package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

			Coffee ethiCoffee = new EthiopiaAmericano();
			ethiCoffee.brewing();
			
			System.out.println();
			Coffee ethiLatte= new Latte(ethiCoffee);
			ethiLatte.brewing();
			
			System.out.println();
			Coffee ethiMocha = new Mocha(new Latte(new EthiopiaAmericano()));
			ethiMocha.brewing();
			
			System.out.println();
			Coffee keyacoffee = new WhippingCream(new Mocha(new KeyaAmericano()));
			keyacoffee.brewing();																	
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
