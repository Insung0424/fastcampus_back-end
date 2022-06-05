<<<<<<< HEAD
package p2;

public interface PlayerLevel {

		abstract void run();
		abstract void jump();
		abstract void turn();
		abstract void showLevelMessage();
		
		default void go(int i) {
			run();
			for(int count = 0; count<i; count++) {
				jump();
			}
			turn();
		}
		
}
=======
package p2;

public interface PlayerLevel {

		abstract void run();
		abstract void jump();
		abstract void turn();
		abstract void showLevelMessage();
		
		default void go(int i) {
			run();
			for(int count = 0; count<i; count++) {
				jump();
			}
			turn();
		}
		
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
