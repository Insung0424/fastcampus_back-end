package ch16;

public class Leastjob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("LJ");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Rest");
	}

}
