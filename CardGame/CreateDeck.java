/*
 * author Kenji Lor
 * this class will create all 53 cards
 * the cards will then be put into a deck. 
 */
package CardGame;

import javax.swing.ImageIcon;

//this class has a static method that will return a deck of 53 cards
public class CreateDeck {
	public static Deck fullDeck() {
	    Deck deck = new Deck();

	    // Agregar cartas para cada palo
	    addSuitToDeck(deck, Card.hearts, "H");
	    addSuitToDeck(deck, Card.diamonds, "D");
	    addSuitToDeck(deck, Card.spade, "S");
	    addSuitToDeck(deck, Card.club, "C");

	    // Agregar Joker
	    deck.addCard(new Card("joker", Card.joker, new ImageIcon("FolderOfCards/joker.png")));

	    return deck;
	}

	private static void addSuitToDeck(Deck deck, String suit, String suitAbbreviation) {
	    String[] rankNames = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	    int[] ranks = {Card.ace, Card.two, Card.three, Card.four, Card.five, Card.six, 
	                   Card.seven, Card.eight, Card.nine, Card.ten, Card.jack, Card.queen, Card.king};

	    for (int i = 0; i < ranks.length; i++) {
	        String fileName = "FolderOfCards/" + rankNames[i] + suitAbbreviation + ".png";
	        deck.addCard(new Card(suit, ranks[i], new ImageIcon(fileName)));
	    }
	}

}
