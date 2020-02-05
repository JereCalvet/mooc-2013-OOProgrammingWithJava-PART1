
/**
 *
 * @author Jere
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;

    //constructores
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    //metodos
    public void printStarts() {
        Random random = new Random();
        String[] line = new String[this.width];
        for (String space : line) {
            if (random.nextDouble() >= 0.9) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
