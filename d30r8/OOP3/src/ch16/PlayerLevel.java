package ch16;

public interface PlayerLevel {
	
	
	void run();
	void jump();
	void turn();
	void show();
	
	default void go(int i) {
		run();
		for(int j=0;j<i;j++) {
			jump();
		}
		turn();
	}
}
