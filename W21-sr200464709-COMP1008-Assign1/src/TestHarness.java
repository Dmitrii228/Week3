/**
 * Name: Dmitrii Demin
 * Date:31.01.2021
 * Time:12:35
 */
import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String firstName = in.nextLine();

        System.out.print("Input your last name: ");
        String lastName = in.nextLine();

        System.out.print("Input your student number:");
        int studentNumber= Integer.parseInt(in.nextLine());

        Student sr1 = new Student(firstName,lastName,studentNumber);

        System.out.println("Your first name is:"+sr1.getFirstName());
        System.out.println("Your last name is:"+sr1.getLastName());
        System.out.println("Your student number is:"+sr1.getStudentNumber());

    }
}
