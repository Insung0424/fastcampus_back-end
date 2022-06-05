<<<<<<< HEAD
package ch19;

public abstract class Decorator extends Coffee{

	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
=======
package ch19;

public abstract class Decorator extends Coffee{

	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
