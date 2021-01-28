import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) throws IllegalAccessException {
        // Datatype  variable name      calling the constructor and passing in System.in
        Scanner           keyboard =    new Scanner(System.in);
        Card              aceOfSpades  = new Card("ace", "spades");
        Card              jesseOfMid  = new  Card("Jesse","Midlady");

        jesseOfMid.setSuit("hearts");
        jesseOfMid.setSuit("Diamonds");
        System.out.println(aceOfSpades);
        System.out.println(jesseOfMid);

    }
}
