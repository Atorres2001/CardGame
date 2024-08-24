/*
 * author: alex torres
 * this class is the player class. this player class has a hand that will store cards.
 */
package CardGame;

public class Player {
	//hand of player that will holds the cards
	private Hand hand;
	
	
	//constructor that receives an hand
	public Player(Hand h) {
		hand = h;
	}
	
	//returns hand
	public Hand getHand() {
		return hand;
	}
	
	public int getHandSize() {
		return hand.getSize();
	}
	//takes card from hand base on index
	public Card removeCard(int index) {
		Card tempCard = hand.removeCard(index);
		return tempCard;
	}
	
	//add card to hand
	public void addCard(Card card ) {
		hand.addCard(card);
	}
	
	//this method will check if the hand has a pair and will get rid of it
		public void removePairs() {
			
			for (int i = 0; i < (hand.getSize() - 2); i++ ) {
				Card c1 = hand.getCard(i);
				
				for (int j =1; j < (hand.getSize() - 1); j++) {
					Card c2 = hand.getCard(j);
					
					if (Card.compareByValue.compare(c1, c2) == 0) {
						hand.removeCard(i);
						hand.removeCard(j);
						System.out.println("pair removed");
					}
					continue;
				}
				continue;
			}
			
			
		}
	
	//toString 
	@Override 
	public String toString() {
		return hand.toString();
	}
}
