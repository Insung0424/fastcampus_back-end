<<<<<<< HEAD
package ch16;

public abstract class PlayerLevel {
		public abstract void run();
		public abstract void  jump();
		public abstract void  turn();
		public abstract void  showLevelMessage();
		
		final public void go (int num) {
				run();
				for (int i=0; i<num; i++) {
					jump();
				}
				turn();
		}
}
=======
package ch16;

public abstract class PlayerLevel {
		public abstract void run();
		public abstract void  jump();
		public abstract void  turn();
		public abstract void  showLevelMessage();
		
		final public void go (int num) {
				run();
				for (int i=0; i<num; i++) {
					jump();
				}
				turn();
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
