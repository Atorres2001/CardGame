/*
 * Author: alex torres 
 * this class will store a deck of cards. this class has an array list that will store a deck of cards.
 */
package CardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>(53);
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
