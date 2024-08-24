package CardGame;
import java.util.Scanner;

//author alex torres
//this class will test run the game
public class Driver {
	
	public static void main(String[] args) {
	
		Game game = new Game();
		
		//game intro
		System.out.println("welcome to the joker game. ");
		
		//starting game 
		game.gameSetup();
		
		//removing pairs
		System.out.println("cards are dealt and all the pairs are being removed");
		
		game.checkingForPairs();
	
		//scanner to get int
		Scanner cin = new Scanner(System.in);
		
		//bool to check if game is don
		
		Boolean gameDone= false;
		
		//while loop that keeps game running
		
		while(!gameDone) {
			int tempIndex;
			
			System.out.println("Enter an number between 0 and " + (game.getC1Size()-1) + ": ");
			tempIndex = cin.nextInt();
			//input validation
			while (tempIndex > game.getC1Size()) {
				System.out.println("please reenter a number between 0 and " + (game.getC1Size()-1));
				tempIndex = cin.nextInt();
			}
			
			game.setPlayerChoosenIndex(tempIndex);
		
			game.playerTurn();
			
			game.computerTurn();
			
			gameDone = game.isGameDone();
		}
		
		cin.close();
	}

}
