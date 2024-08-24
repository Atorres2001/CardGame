/*
 * author alex torres
 * this is the games class that will run the game. this class will create the deck, player, and hand. this class
 * will also will run each step of the game 
 */
package CardGame;

public class Game {
	
	//deck of cards
	private Deck deck;
	
	//hands for players
	private Hand playerHand;
	private Hand computerHand;
	
	//player and computer
	private Player p1;
	 ComputerPlayer c1;
	
	//stores index of combo box from gui
	private int playerChoosenIndex;
	
	//getter and setter for playerChoosenIndex
	public int getPlayerChoosenIndex() {
		return playerChoosenIndex;
	}

	public void setPlayerChoosenIndex(int playerChoosenIndex) {
		this.playerChoosenIndex = playerChoosenIndex;
	}
	
	
	//this method will set up a game
	public void gameSetup() {
		
		//create deck
		deck = CreateDeck.fullDeck();
		
		//shuffle deck
		deck.shuffleDeck();
		
		// Instancia de DeckDealer para manejar la distribución del mazo
		DeckDealer dealer = new DeckDealer();

		// Crear la mano del jugador usando la primera mitad del mazo
		playerHand = new Hand(dealer.dealFirstHalf(deck));

		// Crear la mano del jugador de computadora usando la segunda mitad del mazo
		computerHand = new Hand(dealer.dealSecondHalf(deck));
		
		//add hand to players
		
		//player
		 p1 = new Player( playerHand);
		
		//computer
		 c1 = new ComputerPlayer( computerHand);
			
			
	}
	

	//this method is the player turn. this method will remove a card from the computer hand based on an index
	public void playerTurn() {
		//removing card from index given from combo box action listener
		
		Card tempCard = c1.removeCard(playerChoosenIndex);
		
		//put card into player deck
		p1.getHand().addCard(tempCard);
		
		//check for pairs
		p1.removePairs();
		
		//toString for test run
		System.out.println( p1.toString() );
		
	}
	
	//this method is the computer turn and will simulate the computer playing
	public void computerTurn() {
		//random generated int 
		int generatedInt = c1.GenerateRandomInt();
		
		//remove card from player deck
		Card tempCard = p1.removeCard(generatedInt);
		
		//add card to computer hand
		c1.addCard(tempCard);
		
		//check for pairs
		
		c1.removePairs();
		
	}
	
	//this method checks if the game is over
	public boolean isGameDone () {
		if (p1.getHand().isHandEmpty()) {
			System.out.println("congradulations, you won");
			return true;
		} 
		
		if (c1.getHand().isHandEmpty()) {
			System.out.println("You lost");
			return true;
		}
		
		return false;
	}
	
	//method that will check for pairs at the beginning of the game
	public void checkingForPairs () {
		p1.removePairs();
		c1.removePairs();
	}
	
	//method that returns the size of the hand in c1
	public int getC1Size() {
		return c1.getHandSize();
	}
	

}
