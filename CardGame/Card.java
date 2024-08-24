/*
 * author : alex Torres
 * this class is the card class that will hold the suit, value and image of the card.
 * this class contains a comparator that will compare the values of 2 cards
 * 
 */
package CardGame;

import java.util.Comparator;

import javax.swing.ImageIcon;

public class Card {
    private final Suit suit;
    private final Rank rank;
    private final ImageIcon cardImage;
    public Card(Suit suit, Rank rank, ImageIcon image) {
        this.suit = suit;
        this.rank = rank;
        this.cardImage = image;
    }
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public ImageIcon getImage() {
        return cardImage;
    }
    public static Comparator<Card> compareByValue = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            return o1.getRank().getValue() - o2.getRank().getValue();
        }
    };
    @Override
    public String toString() {
        return rank + " of " + suit + "\n";
    }
}
