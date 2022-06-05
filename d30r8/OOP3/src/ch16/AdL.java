package ch16;

public class AdL implements PlayerLevel{
	@Override
	public void run() {
		System.out.println("A R");
	}

	@Override
	public void jump() {
		System.out.println("A J");
		
	}

	@Override
	public void turn() {
		System.out.println("A T");
		
	}

	@Override
	public void show() {
		System.out.println("A S");
		
	}

}
