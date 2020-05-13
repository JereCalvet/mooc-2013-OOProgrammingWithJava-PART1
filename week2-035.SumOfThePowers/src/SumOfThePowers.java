/*
Temas: operaciones de asignacion
*/
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int sumPotencia,num;
        sumPotencia = num = 0;
        while (num <= n) {
            sumPotencia += (int)Math.pow(2, num);
            num++;
        }
        System.out.println("The result is "+sumPotencia);
        
        //mi codigo esta mejor. Cambie el nombre de sum a sumPotencia para que quede mejor
    }
}
