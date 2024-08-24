package CardGame;
import java.util.Random;

/*
 * author alex torres
 * this class is the computerPlayer class. this class extends the player class. this 
 * class has a method that will simulate a player choosing a random card.
 */


public class ComputerPlayer extends Player{
	
	//constructor that takes in a hand
	public ComputerPlayer(Hand hand) {
		super(hand);
	}
	
	//method that returns a random int value the simulates a the computer making a choice 
	public int GenerateRandomInt () {
		//finding the size of the hand and setting it as the max value
		Random r = new Random();
		int max_value = super.getHandSize();
		int randomInt = r.nextInt(max_value);
		return randomInt;
	}

}
