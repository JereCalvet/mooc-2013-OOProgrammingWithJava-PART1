
/**
 *
 * @author Jere
 */
import java.util.Arrays;
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    //constructores
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    //metodos
    public void printLine() {
        /*
        respuesta propuesta: todo la clase esta igual, excepto este metodo, que no usa un string, sino 
        que directamente imprime la linea
        */
        Random random = new Random();
        String[] line = new String[this.width];
        for (int i = 0; i < line.length; i++){
             if (random.nextDouble() <= this.density) {
                line[i] = "*";
                this.starsInLastPrint++;
            } else {
                line[i] = " ";
            }
        }
         for (String space : line) {
             System.out.print(space);
        }
        System.out.println(); 
    }
    
    public void print(){
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++){
            printLine();
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
