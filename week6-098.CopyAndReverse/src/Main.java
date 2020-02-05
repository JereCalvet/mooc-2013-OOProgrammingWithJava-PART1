
import java.util.Arrays;

public class Main {

    public static int[] reverseCopy(int[] arrayOriginal) {
        int[] copia = new int[arrayOriginal.length];
        for (int i = 0; i <= arrayOriginal.length -1; i++) {
            for (int j = arrayOriginal.length -1 - i; j >= 0; j--) {
                copia[j] = arrayOriginal[i];
            }
        }
        /* respuesta propuesta: 1 solo bucle
         int[] reversed = new int[array.length];
        
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length-1-i];            
        }
        
        return reversed;
    }    
        */
        return copia;
    }

    public static int[] copy(int[] arrayOriginal) {
        int[] copia = new int[arrayOriginal.length];
        //estas lineas se pueden reemplazar por una funcion de java
        // System.arraycopy(arrayOriginal, 0, copia, 0, arrayOriginal.length);
        for (int i = 0; i < arrayOriginal.length; i++) {
            copia[i] = arrayOriginal[i];
        }
        return copia;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

}
