/*
Tema: *Intro Arrays 
      *Iteraccion for i
      *Array como parametro
*/
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String elegantly = "";
        for (int number : array) {
            elegantly += number+", "; 
        }
        System.out.println(elegantly.substring(0, (elegantly.length()-2)));
    }
}
