public class Card {
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments,one for the face name and
     * one for the suit. The value of teh card assumes that aces
     * are high and will dynamically establish the card value
     * when the herCardValue() method is run
     *
     * The constructor must be the same as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Card(String faceName, String suit){
        this.faceName = faceName;
        this.suit = suit;
    }
}