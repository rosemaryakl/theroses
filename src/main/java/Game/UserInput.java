package Game;

public class UserInput {
	
	Game game;
	
	UserInput(Game game){
		this.game = game;
	}
	
	public void quit() {
		System.out.println("Game over!");
		System.exit(0);
	}
	
	public void receiveMovement (char key){
		
		if(key == 'w') {
			this.game.movePlayer(1);
		}
		else if (key == 'd') {
			this.game.movePlayer(2);
		}
		else if (key == 's') {
			this.game.movePlayer(3);
		}
		else if (key == 'a') {
			this.game.movePlayer(4);
		}
		else if (key == 'q'){
			quit();
		}
	}
}
