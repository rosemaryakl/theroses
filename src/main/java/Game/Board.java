package Game;

public class Board {
	
	Game game;
	char player_symb = 'x';
	char win_symb = '!';
	
	public Board(Game game) {
		this.game = game;
	}
	
	public Board(Game game, char player_symbol) {
		this.game = game;
		this.player_symb = player_symbol;
	}
	
	public String getMultipleChar(String given_char, int count)
	{
	  return given_char.repeat(count);
	}
	
	public void printBoard() {
		
		System.out.println(getMultipleChar("_", game.grid_size+2));
		
		for (int i = 1; i < game.grid_size+1; i++) {
			
			if (i == game.grid_size - game.player_y) {
				System.out.println('|'+ getMultipleChar(" ", game.player_x) + this.player_symb + getMultipleChar(" ", game.grid_size - game.player_x - 1) +"|");
			}
			else {
				System.out.println('|'+getMultipleChar(" ", game.grid_size)+"|");				
			}
		}
		System.out.println(getMultipleChar("\u203E", game.grid_size+2));
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Game game = new Game(15);
//		Board b = new Board(game);
//		
//		System.out.println(game.player_x);
//		System.out.println(game.player_y);
//		b.printBoard();
//	}

}
