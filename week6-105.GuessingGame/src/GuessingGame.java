
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while (lowerLimit != upperLimit) {
            //System.out.println("upper "+upperLimit);
            //System.out.println("lower "+lowerLimit);
            int ave = average(lowerLimit, upperLimit); 
            if (isGreaterThan(ave)) {
                lowerLimit = average(lowerLimit, upperLimit) +1;
            } else {
                upperLimit = average(lowerLimit, upperLimit);
            }
            
            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is "+lowerLimit);
            }
        }
    }

    public boolean isGreaterThan(int number) {
        System.out.println("Is your number greater than " + number + "? (y/n)");
        String resp = this.reader.nextLine();
        if (resp.equals("y") || resp.equals("Y")) {  //respuesta propuesta:  return answer.equals("y");
            return true;                             
        }
        return false;
    }

    public int average(int firstNum, int secondNum) {
        return (firstNum + secondNum) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
