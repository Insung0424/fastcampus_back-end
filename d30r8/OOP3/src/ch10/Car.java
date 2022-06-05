package ch10;

public abstract class Car {
	
	abstract void drive();
	abstract void stop();
	abstract void wipper();
	
	public void startCar() {
		System.out.println("start");
	}
	public void turnOff() {
		System.out.println("off");
	}
	public void wash() {}
	public void run() {
		startCar();
		drive();
		wipper();
		stop();
		turnOff();
		wash();
	}
}
