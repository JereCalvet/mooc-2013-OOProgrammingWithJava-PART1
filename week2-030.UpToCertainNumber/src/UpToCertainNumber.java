/*
Temas: ejercicios
*/
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int top = Integer.parseInt(reader.nextLine());
        int num = 1;
        while (num <= top) {
            System.out.println(num);
            num++;
        }    
    }
}
