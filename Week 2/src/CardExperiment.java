import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) throws IllegalAccessException {
        // Datatype  variable name      calling the constructor and passing in System.in
        Scanner           keyboard =    new Scanner(System.in);
        Card              aceOfSpades  = new Card("ace", "spades");
        Card              jesseOfMid  = new  Card("five","Hearts");

        /*jesseOfMid.setSuit("hearts");
        jesseOfMid.setSuit("Diamonds");*/
        System.out.printf("%s is a %s card with value of %d %n", aceOfSpades, aceOfSpades.getCardColour(), aceOfSpades.getFaceValue());
        System.out.printf("%s is a %s card with value of %d%n", jesseOfMid, jesseOfMid.getCardColour(), jesseOfMid.getFaceValue());

    }
}
