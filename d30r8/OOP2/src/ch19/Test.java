package ch19;

public class Test {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata = factory.createCar();
		Car ysonata = factory.createCar();
		
		System.out.println(sonata.getCarNum());
		System.out.println(ysonata.getCarNum());
		
	
	}

}
