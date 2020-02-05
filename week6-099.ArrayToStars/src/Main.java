
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int number : array){
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println(""); //respuesta propuesta: System.out.println(); esto se puede escribir sin parametros 
        }
    }
}
