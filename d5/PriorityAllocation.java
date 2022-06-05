<<<<<<< HEAD
package ch16;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Import a call from a customer with a high customer rating first");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute first to highly skilled counselors");

	}

}
=======
package ch16;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Import a call from a customer with a high customer rating first");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute first to highly skilled counselors");

	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
