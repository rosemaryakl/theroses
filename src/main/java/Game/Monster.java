package Game;

import org.javatuples.Pair;

public class Monster extends GameEntity{
	// Override variables
	
	// Constructor
	Monster(int gridSize){
		super(gridSize, true, "You got eaten!");
	}

}
