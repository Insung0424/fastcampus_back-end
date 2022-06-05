package ch16;

public class BeL implements PlayerLevel{

	@Override
	public void run() {
		System.out.println("B R");
	}

	@Override
	public void jump() {
		System.out.println("B J");
		
	}

	@Override
	public void turn() {
		System.out.println("B T");
		
	}

	@Override
	public void show() {
		System.out.println("B S");
		
	}

}
