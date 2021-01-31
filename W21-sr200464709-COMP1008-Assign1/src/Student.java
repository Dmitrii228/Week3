/**
 * Name: Dmitrii Demin
 * Date:31.01.2021
 * Time:11:35
 */
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;

    /**
     * Create a constructor that takes 3 arguments, firstName, lastName and studentNumber
     */
    public Student(String firstName, String lastName, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    /**
     *Create getters and setters that will do light verifications of the variables.
     */

    /*Setters and getters for the first name*/
    public String getFirstName() {
        if (firstName.contains(" ")){
            throw new IllegalArgumentException(firstName + " should not contain any blanks!");
        }
        int count = 0;
        for (int i = 0; i < firstName.length(); i++) {
            count++;
        }
        if (count<2){
            throw new IllegalArgumentException("Fist name should be at least two characters!");
        }
        else
        return firstName;
    }

    public void setFirstName(String firstName) {

            this.firstName = firstName;
    }

    /*Setters and getters for the last name*/
    public String getLastName() {
        if (lastName.contains(" ")){
            throw new IllegalArgumentException(lastName + " should not contain any blanks!");
        }
        int count = 0;
        for (int i = 0; i < lastName.length(); i++) {
            count++;
        }
        if (count<2){
            throw new IllegalArgumentException("Last name should be at least two characters!");
        }
        else
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /*Setters and getters for the student number*/
    public int getStudentNumber() {
        if(studentNumber<0){
            throw new IllegalArgumentException("The student number should not be less than zero!");
        }
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        this.studentNumber = studentNumber;
    }
}
