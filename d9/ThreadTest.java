<<<<<<< HEAD
package ch20;

class MyThread implements Runnable{
	
		public void run() {
			int i;
			for(i=1;i<=200;i++) {
				System.out.print(i+"\t");
			}
		}
}

public class ThreadTest {

	public static void main(String[] args) {

			System.out.println(Thread.currentThread() + "start");
			
			MyThread runnable = new MyThread();
			Thread th1 = new Thread(runnable);
			Thread th2 = new Thread(runnable);
			
//			MyThread th1 = new MyThread();   extends Thread 일 때 사용법
//			MyThread th2 = new MyThread();
			
			th1.start();
			th2.start();
			
			System.out.println(Thread.currentThread() + "end");
			
			
			/*
			Runnable run = new Runnable() {

				@Override
				public void run() {
					System.out.println("run");
				}
				
			};
			run.run();*/   //간단히 만들어서 사용하는법
	}

}
=======
package ch20;

class MyThread implements Runnable{
	
		public void run() {
			int i;
			for(i=1;i<=200;i++) {
				System.out.print(i+"\t");
			}
		}
}

public class ThreadTest {

	public static void main(String[] args) {

			System.out.println(Thread.currentThread() + "start");
			
			MyThread runnable = new MyThread();
			Thread th1 = new Thread(runnable);
			Thread th2 = new Thread(runnable);
			
//			MyThread th1 = new MyThread();   extends Thread 일 때 사용법
//			MyThread th2 = new MyThread();
			
			th1.start();
			th2.start();
			
			System.out.println(Thread.currentThread() + "end");
			
			
			/*
			Runnable run = new Runnable() {

				@Override
				public void run() {
					System.out.println("run");
				}
				
			};
			run.run();*/   //간단히 만들어서 사용하는법
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
