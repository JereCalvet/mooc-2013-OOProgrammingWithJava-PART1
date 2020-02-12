
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] list = {-3, 2, 3, 4, 7, 8, 12};
        Scanner sc = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(list));
        System.out.println();

        System.out.print("Enter searched number: ");
        String inputNumber = sc.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(list, Integer.parseInt(inputNumber));
        if (tulos) {
            System.out.println("Value " + inputNumber + " is in the array");
        } else {
            System.out.println("Value " + inputNumber + " is not in the array");
        }
    }
}
