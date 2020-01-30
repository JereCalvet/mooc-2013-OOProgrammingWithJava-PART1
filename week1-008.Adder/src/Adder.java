
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numA = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int numB = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: "+ (numA+numB));
        // Implement your program here. Remember to ask the input from user
    }
}
