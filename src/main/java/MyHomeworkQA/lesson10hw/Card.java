package MyHomeworkQA.lesson10hw;

public class Card {

    private char value;
    private String suit;

    public Card(){}

    public Card(char cardVal, String cardSuit){
        this.value = cardVal; // 0-9
        this.suit = cardSuit;
    }

    public String printCard() {
        return "Card{" +
                "value=" + value +
                ", suit='" + suit + '\'' +
                '}';
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

}
