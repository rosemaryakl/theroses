package Game;

public class Runner {
	
	/* 
	 */
	// - (pointScorer) 

	public static void main(String[] args) {
//      System.out.println("Hello world!");
        // Create Game object
        Game game = new Game(15, 222);
        // Create UserInput
        UserInput userInput = new UserInput(game);
        // Start game
        System.out.println("Welcome to maze game");
        System.out.println("Use WASD to move");
        // Start playing game
        while(!game.checkIfEntity()) {
            char c = userInput.receiveMovement();
                        if (c == 'q') break;
        }
        // closes the UserInput/Scanner at the end
        // Only runs if user wins the game
        userInput.winGame();
    }

}
