package ch16;

public class Test {

	public static void main(String[] args) {
		
		Player p = new Player();
		p.play(1);
		
		AdL a = new AdL();
		p.upgradeLevel(a);
		p.play(2);
		
		SpL s = new SpL();
		p.upgradeLevel(s);
		p.play(3);
		
		
	}

}
