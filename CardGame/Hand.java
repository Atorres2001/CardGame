/*
 * author alex torres
 * this class is the hand class that will hold the cards of each player
 * this class has array list that will hold all the card
 */
package CardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	
//array list that holds a all the card in the player hand. 
	private ArrayList<Card> hand; 
	
	
	//constructor that will recieve an Array list and set it to the hand
	public Hand(ArrayList<Card> tempHand) {
		hand =  tempHand;
	}
	//method that will add card to hand
	public void addCard(Card card) {
		hand.add(card);
	}
	
	//method that will remove card from a selected index and returns the card removed
	public Card removeCard(int index) {
		Card tempCard = hand.remove(index);
		return tempCard;		
	}
	
	//method that returns the size of the hand
	public int getSize() {
		return hand.size();
	}
	
	//method that will return a card besed on the index passed
	public Card getCard(int index) {
		return hand.get(index);
	}
	
	//method that will empty hand
	public void emptyHand() {
		hand.clear();
	}
	
	//method that will sort the hand
	public void sort() {
		//sending that hand and the comparator in the card class
		Collections.sort(hand, Card.compareByValue);
	}
	
	//checks to see if hand is empty
	boolean isHandEmpty() {
		if (hand.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	//toString 
	@Override
	public String toString () {
		return hand.toString();
	}

}
