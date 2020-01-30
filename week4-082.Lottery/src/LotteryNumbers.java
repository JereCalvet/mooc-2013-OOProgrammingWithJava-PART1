
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>(6);
        int i, aux;
        i = aux = 0;
        while (i < 7) {
            while (containsNumber(aux) || aux == 0) {
                aux = this.random.nextInt(39)+1;
            }
            this.numbers.add(aux);
            i++;
        }
        /* respuesta propuesta: hizo que el bucle inicial repita hasta tener 7 numeros, creando el efecto
           de "recursion" (si el numero ya esta, volve a sacar otro y verifica si ya esta)
           muy bueno, sirve para aprender. yo aumentaba siempre el iterador
        
               while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(39) + 1;
            boolean alreadyDrawn = this.containsNumber(newNumber);
 
            // we add the number only if it is not already among the drawn numbers
            if (!alreadyDrawn) {
                this.numbers.add(newNumber);
        */
    }

    public boolean containsNumber(int number) {
        if (!this.numbers.contains(number)) {
            return false;
        }
        return true;
    }
}
