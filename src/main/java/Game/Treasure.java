package Game;

public class Treasure extends GameEntity {
	// EndGame - True
	// Message - You won
	
	// Constructor
	Treasure(int gridSize){
		super(gridSize, true, "You won!");
	}
}