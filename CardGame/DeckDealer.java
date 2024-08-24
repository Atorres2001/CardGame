package CardGame;

import java.util.ArrayList;

public class DeckDealer {

    public ArrayList<Card> dealFirstHalf(Deck deck) {
        ArrayList<Card> firstHalf = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            firstHalf.add(deck.getDeck().get(i));
        }
        return firstHalf;
    }

    public ArrayList<Card> dealSecondHalf(Deck deck) {
        ArrayList<Card> secondHalf = new ArrayList<>();
        for (int i = 26; i < 53; i++) {
            secondHalf.add(deck.getDeck().get(i));
        }
        return secondHalf;
    }
}
