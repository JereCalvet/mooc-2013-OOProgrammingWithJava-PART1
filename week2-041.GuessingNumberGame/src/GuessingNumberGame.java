
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        // program your solution here. Do not touch the above lines!
        int number = 0;
        if (number == numberDrawn){
            System.out.println("reroll, number was: "+numberDrawn);
            numberDrawn = drawNumber();
        }
        int guessCounter = 1;
        while (number != numberDrawn){
            System.out.print("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());
            if (number < numberDrawn){
                System.out.println("The number is greater, guesses made: "+guessCounter);
            } else if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+guessCounter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
            guessCounter++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
