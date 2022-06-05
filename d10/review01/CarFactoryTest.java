<<<<<<< HEAD
package review01;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
	}
}

=======
package review01;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
	}
}

>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
