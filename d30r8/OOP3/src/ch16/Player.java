package ch16;

public class Player {
	private PlayerLevel level;
	
	Player(){
		level = new BeL();
		level.show();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	void play(int i){
		level.go(i);
	}
	
	
}
