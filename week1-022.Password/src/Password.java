/*
Temas: loops
*/
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while (true) {
            System.out.println("Type the password: ");
            String inPut = reader.nextLine();
            if (password.equals(inPut)) {
                System.out.println("Right!");
                System.out.println("\nThe secret is: jryy qbar+1!");
                break;
            } else {
                System.out.println("Wrong!");
            }
            System.out.println("");
        }
    }
}
