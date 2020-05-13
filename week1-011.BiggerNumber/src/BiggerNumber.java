/*
Temas: operaciones basicas
*/
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numA = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int numB = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println("The bigger number of the two numbers given was: "+ Math.max(numA, numB));
        // Implement your program here. Remember to ask the input from user
    }
}
