package ch16;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("RR");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("same all");
	}

}
