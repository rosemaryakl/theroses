package Game;

import org.javatuples.Pair;

public abstract class GameEntity {
	// Location - xPos, yPos
	// Message - @Override by subclasses
	// EndGame (Boolean) -> true/false (as an extra). Always end game for now
	
	// Dependencies:
	// 	Runner -> check if GameEntity is in same position as player
	
	// Fields
	private final boolean endGame;
	private final String message;
	private final Pair<Integer, Integer> position;
	
	// Constructor
	GameEntity(Pair<Integer, Integer> position, boolean endGame, String message){
		this.position = position;
		this.endGame = endGame;
		this.message = message;
	}
	
	//Map.get(Position);
	// Monster is at (2,3) map.get((2,3)) will return the monster
}
