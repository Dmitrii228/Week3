public class Card {
    private String faceName;
    private String suit;


    /**
     * This constructor takes 2 arguments, one for face name and one for the suit. The value of a card assumes that aces
     * are high and will dynamically establish the card value when the getCardValue() method is run
     *
     * The constructor must be the same as the class
     * The constructor does not have a return type
     */

    public Card (String faceName, String suit){
        this.faceName=faceName;
        this.suit=suit;
    }



    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

}
