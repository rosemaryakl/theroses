package Game;
import java.util.Scanner;
public class UserInput {
    Game game;
    public Scanner scanner;
    public UserInput(Game game){
        this.game = game;
        this.scanner = new Scanner(System.in);  // Create a Scanner object
    }
    public void quit() {
        System.out.println("Game over!");
        //System.exit(0);
    }
    public void winGame() {
        System.out.println("Game over! Thanks for playing");
        //this.scanner.close();
        //System.exit(0);
    }
    public char receiveMovement (){
        String input = this.scanner.next().toLowerCase();
        char key = input.charAt(0);  // Read user input
        if(key == 'w') {
            this.game.movePlayer(1);
        }
        else if (key == 'd') {
            this.game.movePlayer(2);
        }
        else if (key == 's') {
            this.game.movePlayer(3);
        }
        else if (key == 'a') {
            this.game.movePlayer(4);
        }
        else if (key == 'q'){
            quit();
        }
        return key;
    }
}