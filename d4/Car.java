<<<<<<< HEAD
package ch10;

public abstract class Car {
		public abstract void drive();
		public abstract void stop();
		public abstract void wiper();
		
		public void start() {
			System.out.println("시동을 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("시동을 끕니다.");
		}
		public void washCar() {
			
		}
		
		final public void run() {
			start();
			drive();
			wiper();
			stop();
			turnOff();
			washCar();
		}
}
=======
package ch10;

public abstract class Car {
		public abstract void drive();
		public abstract void stop();
		public abstract void wiper();
		
		public void start() {
			System.out.println("시동을 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("시동을 끕니다.");
		}
		public void washCar() {
			
		}
		
		final public void run() {
			start();
			drive();
			wiper();
			stop();
			turnOff();
			washCar();
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
