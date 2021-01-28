import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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
    public Card(String faceName, String suit) throws IllegalAccessException {
        setFaceName(faceName);
        setSuit(suit);
    }


    public void setSuit(String suit) throws IllegalAccessException {
        suit=suit.toLowerCase();
        List<String>  validSuits = Arrays.asList("hearts", "diamonds","spades", "clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalAccessException(suit+" is not a valid. Use one of "+validSuits);
    }

    /**
     * Validates that the argument is in the collection of the list and set the instance variables
     *
     */
    public void setFaceName(String faceName) throws IllegalAccessException {
        faceName = faceName.toLowerCase();
        List<String>  faceNames = Arrays.asList("two", "three","four", "five", "six","seven", "eight");

        if (faceNames.contains(faceName))
                 this.faceName = faceName;
        else
            throw new IllegalAccessException(faceName + " is not valid, use "+faceNames);
    }


    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }



    public String toString(){
        return faceName + " of " + suit;
    }
}