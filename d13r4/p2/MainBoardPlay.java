<<<<<<< HEAD
package p2;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.Play(1);
		
		ADPlayer aLevel = new ADPlayer();
		player.UpgradeLevel(aLevel);
		player.Play(2);
		
		SPlayer sLevel = new SPlayer();
		player.UpgradeLevel(sLevel);
		player.Play(3);
		
	}

}
=======
package p2;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.Play(1);
		
		ADPlayer aLevel = new ADPlayer();
		player.UpgradeLevel(aLevel);
		player.Play(2);
		
		SPlayer sLevel = new SPlayer();
		player.UpgradeLevel(sLevel);
		player.Play(3);
		
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
