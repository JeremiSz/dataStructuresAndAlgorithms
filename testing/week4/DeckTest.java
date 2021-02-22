package week4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeckTest {
    @Test
    void checkConstructor(){
        Deck deck = new Deck();
        assertEquals(52,deck.cards.length);
        StringBuilder sb = new StringBuilder();
        for (Card c:deck.cards) {
            sb.append(c.toString());
            sb.append(", ");
        }
        sb.append("\n");
        deck.shuffle();
        for (Card c:deck.cards) {
            sb.append(c.toString());
            sb.append(", ");
        }
        sb.append("\n");
        deck.shuffle();
        for (Card c:deck.cards) {
            sb.append(c.toString());
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
