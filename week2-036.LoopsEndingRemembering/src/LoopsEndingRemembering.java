
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num, sum, countNum, countEven, countOdd;
        countEven = countOdd = countNum = num = sum = 0;
        
        /* resultado propuesto usa break y calcula los impares 
        int odd = numbers - even;
        if (number == -1) {
                break;
            }
        */
        while (num != -1) {
            num = Integer.parseInt(reader.nextLine());
            if (num != -1) {
                if (num % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
                sum += num;
                countNum++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + countNum);
        System.out.println("Average: " + ((double) sum / countNum));
        System.out.println("Even numbers: "+countEven);
        System.out.println("Odd numbers: "+countOdd);        
    }
}
