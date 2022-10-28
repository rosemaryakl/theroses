package Game;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import org.javatuples.Pair;

public class Game {
	
	/*
	 * checkIfEntity() -> check if an entity is in the same position
	 * entityAction() -> sends message, possibly end the game
	 * gameTick() -> calls movePlayer(), checkIfEntity(), entityAction()
	 * 
	 */
	
	
	/*
	 * check player and treasure not on top of monster initially
	 * 
	 */
	
	/* attributes
	// - player x pos
	// - player y pos
	 * - treasure position x
	 * - treasure position y 
	 * - grid size n
	 * - starting pos
	 * - distance from treasure
	 */
	
	public Player p;
	public Treasure t;
	public EntitiesInPlay entitiesInPlay;
	public int grid_size;
//	public int startPos;
	public int distTreasure;
	public int noOfMons;
   
    public Game(int grid_size, int noOfMons) {
        
        this.grid_size = grid_size;
        this.noOfMons = noOfMons;
        
        p = new Player(grid_size);
        
        //GameEntity[] gi = new GameEntity[1+noOfTreas+noOfMons];
        
        entitiesInPlay = new EntitiesInPlay();
        
        // Add treasure
        Treasure treasure = new Treasure(grid_size);
        this.t = treasure;
        
        while(entitiesInPlay.getEntity(treasure.getPosition()) != null && treasure.getPosition() != p.getPosition()) {
        	treasure.setPosition(grid_size);
        }
        
        entitiesInPlay.addEntity(treasure);
        
        
        
        // Add monsters
        for (int i = 0; i < noOfMons; i++) {
            Monster monster = new Monster(grid_size);
            
            while(entitiesInPlay.getEntity(monster.getPosition()) != null && monster.getPosition() != p.getPosition()) {
            	monster.setPosition(grid_size);
            }
            
            entitiesInPlay.addEntity(monster);
        }
   
    }
	
	public void movePlayer(int direction) {
		
		switch(direction) {
		
		case 1: // North
			if (this.p.getyPos() >= this.grid_size - 1) {
				System.out.println("Cannot move out of bounds (north)");
			}
			else {
				this.p.setyPos(this.p.getyPos() + 1);
			}
			break;
			
		case 2: // East
			if (this.p.getxPos() >= this.grid_size - 1) {
				System.out.println("Cannot move out of bounds (east)");
			}
			else {
				this.p.setxPos(this.p.getxPos() + 1);
			}
			break;
			
		case 3: // South
			if (this.p.getyPos() <= 0) {
				System.out.println("Cannot move out of bounds (south)");
			}
			else {
				this.p.setyPos(this.p.getyPos() - 1);
			}
			break;
			
		case 4: // West
			if (this.p.getxPos() <= 0) {
				System.out.println("Cannot move out of bounds (west)");
			}
			else {
				this.p.setxPos(this.p.getxPos() - 1);
			}
			break;
			
			// Check if player encountered monster
			
		
		}
		
		this.calcDistance();
		printPosition();
		System.out.println(String.format("You are %d spaces from the treasure", this.distTreasure));
	}
	
	public void calcDistance() {
		// Get treasure
		// For loop
		
		
		int dist_x = Math.abs(this.p.getxPos() - this.t.getxPos());
		int dist_y = Math.abs(this.p.getyPos() - this.t.getyPos());
		this.distTreasure = dist_x + dist_y; 
	}
	
	public int calcDistance(GameEntity entity) {
		// Get treasure
		// For loop
		
		
		int dist_x = Math.abs(this.p.getxPos() - entity.getxPos());
		int dist_y = Math.abs(this.p.getyPos() - entity.getyPos());
		return dist_x + dist_y; 
	}
	
	public void printPosition() {
		int i = 1;
		for(GameEntity entity : this.entitiesInPlay.gi.values()) {
			if(entity instanceof Monster) {
				System.out.println("Monster " + i + " is " + calcDistance(entity) + " steps away");
				i++;
			}
			
			
		}
		
		double middle = grid_size/2;
		int relative_x = (int) Math.ceil(this.p.getxPos() - middle);
		int relative_y = (int) Math.ceil(this.p.getyPos() - middle);
		String horizontal_compass = (relative_x<0 ? "West" : "East");
		String vertical_compass = (relative_y<0 ? "South": "North");
		
		System.out.println(String.format("You are currently at %d %s, %d %s", Math.abs(relative_x), horizontal_compass, Math.abs(relative_y), vertical_compass));
	}
	
	public static int genRandom(int max) {
		
		return ThreadLocalRandom.current().nextInt(0,max);

	}
	
	public boolean checkIfEntity() {
		GameEntity entity = entitiesInPlay.getEntity(this.p.getPosition());
		
		if(entity != null) {
			System.out.println(entity.getMessage());
			
			return entity.isEndGame();
		}
		
		return false;
		
	}


}
