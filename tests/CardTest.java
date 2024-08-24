package tests;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.Test;

import CardGame.*;

public class CardTest {

	@Test
    public void testCompareByValue_LowerRank() {
        // Configurar
        Card card1 = new Card(Suit.HEARTS, Rank.FIVE, new ImageIcon("5H.png"));
        Card card2 = new Card(Suit.SPADES, Rank.TEN, new ImageIcon("10S.png"));
        
        // Ejecutar
        int result = Card.compareByValue.compare(card1, card2);
        
        // Validar
        assertEquals(-5, result);
    }

}
