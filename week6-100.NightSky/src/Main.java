
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.printStarts();
        
          Random random = new Random();
          int i = 0;
          while (random.nextDouble() < 0.5){
              i++;
          }
          System.out.println(i);

    }
}
