<<<<<<< HEAD
package review01;

public class CarFactory {
	//싱글톤 패턴과 static 예제
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}

	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
	
	

}
=======
package review01;

public class CarFactory {
	//싱글톤 패턴과 static 예제
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}

	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
	
	

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
