package tests;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.Before;
import org.junit.Test;

import CardGame.*;

public class DeckTest {

	private Deck deck;

    @Before
    public void setUp() {
        deck = new Deck(); // Inicializar el mazo
    }

    @Test
    public void testAddCard() {
    	ImageIcon icon = new ImageIcon("5H.png");
        // Crear una nueva carta
        Card newCard = new Card("hearts", 5, icon);

        // Obtener el tamaño inicial del mazo
        int initialSize = deck.getDeck().size();

        // Añadir la nueva carta al mazo
        deck.addCard(newCard);

        // Verificar que el tamaño del mazo ha incrementado en 1
        assertEquals("El tamaño del mazo debe aumentar en 1.", initialSize + 1, deck.getDeck().size());

        // Verificar que la última carta en el mazo es la que se acaba de añadir
        assertEquals("La última carta añadida debe estar en la última posición del mazo.", newCard, deck.getDeck().get(deck.getDeck().size() - 1));
    }

}
