package Game;

public class Board {
	
	Game game;
	char player_symb = 'x';
	char win_symb = '!';
	
	public Board(Game game) {
		this.game = game;
	}
	
	public String getSpace(int count)
	{
	  String space="";
	  for(int i=0;i<count;i++)
	        space+=" ";
	   return space;
	}
	
	public void printBoard() {
		
		for (int i = 0; i < game.grid_size; i++) {
			
			if (i == game.grid_size - game.player_y) {
				System.out.println('|'+ getSpace(game.player_x -1) + player_symb + getSpace(game.grid_size - game.player_x) +"|");
			}
			else {
				System.out.println('|'+getSpace(game.grid_size)+"|");				
			}
		}
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
