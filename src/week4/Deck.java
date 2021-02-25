package week4;

public class Deck {
    Card[] cards;

    public Deck(){
        this.cards = new Card[52];
        String[] suits = {"Heart","Diamonds","Club","Spade"};
        for (int i = 0; i < 4; i++) {
            String suit = suits[i];
            for (int j = 0; j < 13; j++) {
                this.cards[i * 13 + j] = new Card(j + 1,suit);
            }
        }
    }

    public void shuffle(){
        for (int i = 0; i < 52; i++) {
            int toSwap = (int)(Math.random() * 52);
            Card temp = cards[toSwap];
            cards[toSwap] = cards[i];
            cards[i] = temp;
        }
    }
}
