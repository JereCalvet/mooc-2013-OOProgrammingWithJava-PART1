
public class Printing {

    public static void printStars(int amount) {
        //resultado propuesto: iterador se llama printed
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        //resultado propuesto: iterador se llama printed
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }

        /*   //resultado propuesto: iterador se llama printed y con un while     
            while (printed < height) {
                  printStars(width);
                  printed = printed + 1;*/
    }

    public static void printTriangle(int size) {
        //resultado propuesto: iterador se llama row
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
