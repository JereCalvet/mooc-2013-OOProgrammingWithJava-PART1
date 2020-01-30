
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int numA = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int numB = Integer.parseInt(reader.nextLine());
        if (numA == numB){
            System.out.println("The numbers are equal!");
        } else if (numA > numB) {
            System.out.println("Greater number: "+ numA);
        } else {
            System.out.println("Greater number: "+ numB);
        }
    }
}
