
import java.util.Random;

public class Dice {

    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.random = new Random();
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
      //respuesta esperada: return this.random.nextInt(this.numberOfSides) + 1;
      //el codigo que hice funciona pero es feo
        int aux = this.random.nextInt(numberOfSides + 1);
        if (aux == 0) {
            return aux + 1;
        }
        return aux;
    }
}
