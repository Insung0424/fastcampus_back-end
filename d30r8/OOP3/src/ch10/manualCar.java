package ch10;

public class manualCar extends Car{

	@Override
	void drive() {
		System.out.println("manual drive");
	}

	@Override
	void stop() {
		System.out.println("manual stop");
	}

	@Override
	void wipper() {
		System.out.println("wipe");
	}
	
	

}
