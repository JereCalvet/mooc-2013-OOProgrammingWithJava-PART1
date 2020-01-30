
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /*System.out.print("Type a number: ");
        int fact = Integer.parseInt(reader.nextLine());
        if (fact == 0) {
            System.out.println("Factorial is 1");
        } else {
            int num = 1;
            int sum = 1;
            while (num <= fact) {
                sum *= num;
                num++;
            }
            System.out.println("Factorial is " + sum);
        }
        */
        
        //llegue al resultado con mi codigo pero la version oficial estaba mas acertada, en cuanto a 
        //nombres de variables y matematicamente. En mi codigo se podia sacar el if inicial.
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1; //evita que el factorial multiplique x 0  (3! <> 0*1*2*3). fact de 0 = 1;
        int number = 1;
        while (number <= n) {
            factorial *= number;
            number++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
