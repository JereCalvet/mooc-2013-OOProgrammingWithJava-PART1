/*
Tema: Clases:
            *metodo llamando otro metodo de la misma clase
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        
        while (true) {
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                break;
            }
            
            stats.addNumber(number);
            
            if (number % 2 == 0){
               statsEven.addNumber(number);
            } else {
               statsOdd.addNumber(number);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("som of even: "+statsEven.sum());
        System.out.println("sum of odd: "+statsOdd.sum());
    }
}
