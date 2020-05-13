/*
Temas:
*metodos con parametros
    *metodos llamando otros metodos
*/
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int printed = 0; //resultado propuest: iterador se llama i
        while (printed < amount) {
            System.out.print(" ");
            printed++;
        }
    }

    public static void printTriangle(int size) {
        int printed = 1; //resultado propuest: iterador se llama i
        while (printed <= size) {
            printWhitespaces(size - printed);
            printStars(printed);
            printed++;
        }
    }

    public static void printStand(int xmasHeight) {
        printWhitespaces(xmasHeight - 2);
        printStars(3);
        printWhitespaces(xmasHeight - 2);
        printStars(3);
    }

    public static void xmasTree(int height) {
        /*int altura, sum;
    altura = height;
    sum = -1;
        /* funciona. yo llegue de pedo, no estoy orgulloso de este codigo
        resultado propuesto: es mejor xq yo uso 2 variables auxiliares
        while (altura>0) {
            altura--;
            sum = sum +2;
            printWhitespaces(altura);
            printStars(sum);
        }*/
        int i = 1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
        printStand(height);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
