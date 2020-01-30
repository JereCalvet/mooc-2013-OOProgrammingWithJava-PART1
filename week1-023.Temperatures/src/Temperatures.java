
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type the temperatures or 999 to exit: ");
            double value = Double.parseDouble(reader.nextLine());
            if (value == 999) {
               break; 
            } else if (value >= -30.0 && value <= 40.0) {
                Graph.addNumber(value);
                System.out.println("");
            }
        }
        System.out.println("Bye");
    }
}
