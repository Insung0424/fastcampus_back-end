package ch16;

public class SpL implements PlayerLevel{
	@Override
	public void run() {
		System.out.println("S R");
	}

	@Override
	public void jump() {
		System.out.println("S J");
		
	}

	@Override
	public void turn() {
		System.out.println("S T");
		
	}

	@Override
	public void show() {
		System.out.println("S S");
		
	}
}
