package Game;

import java.util.concurrent.ThreadLocalRandom;

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
	private Pair<Integer, Integer> position;
	
	// Constructor
	GameEntity(Pair<Integer, Integer> position, boolean endGame, String message){
		// Generate position
		this.position = position;
		
		this.endGame = endGame;
		
		this.message = message;
	}
	
	public void setPosition(int gridSize) {
		this.position = new Pair<Integer, Integer>(genRandom(gridSize), genRandom(gridSize));
	}
	
	// Implement this
	public static int genRandom(int max) {
		
		return ThreadLocalRandom.current().nextInt(0,max);

	}
	
	public Pair<Integer, Integer> getPosition(){
		return this.position;
	}
	
	
	
	//Map.get(Position);
	// Monster is at (2,3) map.get((2,3)) will return the monster
}
