/*
Temas: ejercicios
*/
public class EvenNumbers {

    public static void main(String[] args) {
        int num = 1;
        while (num < 101) {
            if (num % 2 == 0) {
                System.out.println(num);
            }    
            num++;
        }    
        /*
        solucion alternativa
        int number = 2;
 
        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }
        */
    }
}
