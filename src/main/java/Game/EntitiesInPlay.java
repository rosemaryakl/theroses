package Game;

import org.javatuples.Pair;
import java.util.HashMap;


public class EntitiesInPlay {
	// ArrayList<GameEntity> 
	// addEntity() 
	// Array of positions -> HashMap((x, y), Monster)
	

   
   HashMap<Pair<Integer, Integer>, GameEntity> gi = new HashMap<Pair<Integer, Integer>, GameEntity>();
   
   
   // Constructor
   public EntitiesInPlay(HashMap<Pair<Integer, Integer>, GameEntity> gi) {
	    
	    if (gi == null) {
	        throw new IllegalArgumentException("Entities cannot be null");
	    }
	    
	    if (gi.size() == 0) {
	        throw new IllegalArgumentException("Must be at least one player and one treasure in entities.");
	    }
	    
	    this.gi = gi;
	}
   
   
   public EntitiesInPlay() {
	// TODO Auto-generated constructor stub
   }


public void addEntity(GameEntity entity) {
	   this.gi.put(entity.getPosition(), entity);
   }
   
   public GameEntity getEntity(Pair<Integer, Integer> position) {
	   return gi.get(position);
   }
   
   public void clearEntities() {
	   this.gi.clear();
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
