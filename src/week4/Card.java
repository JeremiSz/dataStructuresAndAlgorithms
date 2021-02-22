package week4;

public class Card{
    private int face; // 1 to 13 representing Ace to King
    private String suit; //"Hearts", "Diamonds", "Clubs", or "Spades"

    public Card(int f, String s) {
        face = f;
        suit = s;
    }

    public int getFace(){
        return face;
    }

    public String getSuit() {
        return suit;
    }
    public String toString(){
        return " " + face + " of " + suit;
    }
}
