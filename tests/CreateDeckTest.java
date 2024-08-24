package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import CardGame.*;


public class CreateDeckTest {

	@Test
    public void testFullDeckCreation() {
        // Ejecutar el método fullDeck()
        Deck deck = CreateDeck.fullDeck();

        // Verificar el número total de cartas
        int expectedCardCount = 53; // 52 cartas estándar + 1 joker
        assertEquals("El mazo debe contener 53 cartas.", expectedCardCount, deck.getDeck().size());

        // Verificar que cada carta tiene la imagen correcta asignada
        for (Card card : deck.getDeck()) {
            assertNotNull("Cada carta debe tener una imagen asignada.", card.getImage());
        }
    }

}
