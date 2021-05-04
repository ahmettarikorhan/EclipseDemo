package javacampDay4HWw3;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		
		Game game1 = new Game(1, "Minecraft", 100);
		
		
		gameManager.buyGame(game1);
		
		PlayerManager playerManager = new PlayerManager();
		
		Player player1 = new Player(1, "mythredd", "1.1.2000");
				
		playerManager.addPlayer(player1);
	}

}
