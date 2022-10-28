package Game;

import org.javatuples.Pair;

public class Player extends GameEntity{
	
	Player(Pair<Integer, Integer> position, boolean endGame, String message){
		super(position, endGame, message);
	}

}