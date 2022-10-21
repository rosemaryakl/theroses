package Game;

public class UserInput {
	
	public void quit() {
		System.out.println("Game over!");
		System.exit(0);
	}
	
	public void receiveMovement (char key){
		
		if(key == 'w') {
			moveNorth(); // froom other team
		}
		else if (key == 'd') {
			moveEast();
		}
		else if (key == 's') {
			moveSouth();
		}
		else if (key == 'a') {
			moveWest();
		}
		else (key == 'q'){
			quit(); 
		}
	}
	

	
	/* attribute
	 *  - scanner object 
	 *  
	 *  methods
	 *  - receiveMovement
	 *  - quitGame (closes Scanner)
	 */



}
