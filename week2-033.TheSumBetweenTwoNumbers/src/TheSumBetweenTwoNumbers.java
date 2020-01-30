
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());  
        int num = first;
        int sum = 0;
        while (num <= second){
            sum += num;
            num++;
        }
        System.out.println("Sum is "+sum);
    }
}
