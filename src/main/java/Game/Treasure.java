package Game;

import org.javatuples.Pair;

public class Treasure extends GameEntity {
	// EndGame - True
	// Message - You won
	
	// Constructor
	Treasure(Pair<Integer, Integer> position, boolean endGame, String message){
		super(position, endGame, message);
	}
}