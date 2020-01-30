
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        /* propuesto
          int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }
        return greatest;
        */
        int greatest = Math.max((Math.max(number1, number2)), number3);
        return greatest;
        /* mi primer respuesta
        if (number1 >  number2 && number1 >  number3) {
            return number1;
        }
        if (number2 >  number1 && number2 >  number3) {
            return number2;
        }
        if (number3 >  number1 && number3 >  number2) {
            return number3;
        }
        return number1;
        */
    }


    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
