package Game;

import java.util.concurrent.ThreadLocalRandom;

import org.javatuples.Pair;

public class Player {
	
	private int xPos;
	private int yPos;
	
	Player(int gridSize){
		this.xPos = genRandom(gridSize);
		this.yPos = genRandom(gridSize);
	}
	
	
	// Implement this
	public int genRandom(int max) {
		return ThreadLocalRandom.current().nextInt(0,max);
	}
	
	public Pair<Integer, Integer> getPosition() {
		return new Pair<Integer, Integer>(this.xPos, this.yPos);
	}


	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

}