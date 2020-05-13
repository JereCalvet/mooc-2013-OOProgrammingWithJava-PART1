/*
Temas: operaciones basicas
*/
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numA = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int numB = Integer.parseInt(reader.nextLine());
        System.out.println("");
        double result = (double)numA / (double)numB; 
        System.out.println("Division: "+numA+" / "+numB+" = "+ result);
        /*
        Resultado propuesto
         System.out.println("Division: " + firstNumber + " / " + secondNumber +
                           " = " + (1.0 * firstNumber / secondNumber));
        */
    
// Implement your program here. Remember to ask the input from user.
    }
}
