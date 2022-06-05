package ch16;

public class PA implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("vip");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("grade");
	}

}
