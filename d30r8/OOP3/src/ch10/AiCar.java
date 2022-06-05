package ch10;

public class AiCar extends Car{

	@Override
	void drive() {
		System.out.println("AI drive");		
	}

	@Override
	void stop() {
		System.out.println("AI stop");	
	}

	@Override
	void wipper() {
		System.out.println("AI wipe");
	}

	@Override
	public void wash() {
		System.out.println("AI wash");
	}
	
}
