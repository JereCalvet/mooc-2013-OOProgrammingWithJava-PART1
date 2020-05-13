/*
Temas: ejercicios
*/
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());     
        if (second >= first) {
            while (first <= second) {
            System.out.println(first);
            first++;
            }    
        }   
        /*
        resultado propuesto (usar otra variable para no perder el valor de first)
         int number = first;
        while (number <= last) {
            System.out.println(number);
            number++;
        */
        }
    }
