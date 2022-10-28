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
	GameEntity(int gridSize, boolean endGame, String message){
		// Generate position
		setPosition(gridSize);
		
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
	
	public boolean isEndGame() {
		return endGame;
	}

	public String getMessage() {
		return message;
	}

	public Pair<Integer, Integer> getPosition(){
		return this.position;
	}
	
	public int getxPos() {
		return position.getValue0();
	}

	public int getyPos() {
		return position.getValue1();
	}

	
	//Map.get(Position);
	// Monster is at (2,3) map.get((2,3)) will return the monster
}
