<<<<<<< HEAD
package ch22;

class Bank{
	private int money = 10000;
	
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m+save);

	}
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	public void run() {
		System.out.println("save");
		SyncMain.MyBank.saveMoney(3000);
		System.out.println("save 3000 : " + SyncMain.MyBank.getMoney());
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("spend");
		SyncMain.MyBank.minusMoney(1000);
		System.out.println("spend 1000 : " + SyncMain.MyBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank MyBank = new Bank();

	public static void main(String[] args) {

			Park p = new Park();
			p.start();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ParkWife pw = new ParkWife();
			pw.start();
			
	}

}
=======
package ch22;

class Bank{
	private int money = 10000;
	
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m+save);

	}
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	public void run() {
		System.out.println("save");
		SyncMain.MyBank.saveMoney(3000);
		System.out.println("save 3000 : " + SyncMain.MyBank.getMoney());
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("spend");
		SyncMain.MyBank.minusMoney(1000);
		System.out.println("spend 1000 : " + SyncMain.MyBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank MyBank = new Bank();

	public static void main(String[] args) {

			Park p = new Park();
			p.start();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ParkWife pw = new ParkWife();
			pw.start();
			
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
