package Game;

public class Runner {
	
	/* 
	 */
	// - (pointScorer) 

	public static void main(String[] args) {
//		System.out.println("Hello world!");
		
		// Create Game object
		Game game = new Game(15);
		
		// Create UserInput
		UserInput userInput = new UserInput(game);
		
		// Start game
		System.out.println("Welcome to maze game");
		System.out.println("Use WASD to move");
		
		// Start playing game
		while(!game.checkIfWin()) {
			userInput.receiveMovement();
		}
		
		// closes the UserInput/Scanner at the end
		// Only runs if user wins the game
		userInput.winGame();
	}

}
