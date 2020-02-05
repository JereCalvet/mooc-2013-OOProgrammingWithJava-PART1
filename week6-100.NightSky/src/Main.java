
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky r = new NightSky(0.3, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());

        r.print();
        System.out.println("Number of stars: " + r.starsInLastPrint());
        System.out.println("");

        r.print();
        System.out.println("Number of stars: " + r.starsInLastPrint());
        System.out.println("");

        
    }
}
