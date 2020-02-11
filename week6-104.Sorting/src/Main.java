
import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        /*
        hola: asi se imprime 
         System.out.println( Arrays.toString(array) );
        */
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + ", ";
        }
        str = str.substring(0, str.length() - 2);
        System.out.println("{ " + str + " }");
    }

    public static int smallest(int[] array) {
        /*
        respuesta propuesta: guardo el valor 0 en una variable auxiliar y dps fue recorriendo el array
        comparando si era mas chico. si pasaba, reemplazaba el valor en la variable auxiliar.
        yo directamente lo ordene y devolvi el primero.
        en terminos de recursos, el propuesto es mas eficiente.
          int smallest = table[0];
          for (int i = 1; i < table.length; i++) {
              if (table[i] < smallest) {
                  smallest = table[i];
                }
           }
          return smallest;
        */
        int[] arrayCopy = array.clone();
        boolean swap = true;
        while (swap == true) {
            swap = false;
            for (int i = 0; i < arrayCopy.length; i++) {
                if (i + 1 < arrayCopy.length) {
                    if (arrayCopy[i] > arrayCopy[i + 1]) {
                        //swaps i   -> i+1
                        //      i+1 <- i
                        arrayCopy[i] += arrayCopy[i + 1];
                        arrayCopy[i + 1] = arrayCopy[i] - arrayCopy[i + 1];
                        arrayCopy[i] -= arrayCopy[i + 1];
                        swap = true;
                    }
                }
            }
        }
        return arrayCopy[0];
    }

    public static int indexOfTheSmallest(int[] array) {
        /*
        resp propuesta: guardo el index 0 en una variable y fue recorriendo cada valor del array
        comparando si era mas chico. si sucedia: reemplazaba el valor de la variable auxiliar.
        yo busque el mas chico y reccori el array buscando el indice del mismo.
        en terminos de recursos, el propuesto es mas eficiente.
         int theIndexOfSmallest = 0;
 
        for (int i = 0; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
        return theIndexOfSmallest;
        */
                
        int index = 9999999;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int since) {
        /*
        resp propuesta: en terminos de recursos, el propuesto es mas eficiente.
            int theIndexOfSmallest = startIndex;
 
        for (int i = startIndex; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
        return theIndexOfSmallest;
        */
        
        //copio el array desde hasta el final y guardo en otro array 
        int[] arrayCopia = new int[array.length - since];
        int counter = 0;
        for (int i = since; i < array.length; i++) {
            arrayCopia[counter] = array[i];
            counter++;
        }
        //busco smallest en el array copia y busco el indicie del smallest en el array original
        int index = 9999999;
        for (int i = 0; i < array.length; i++) {
            if (smallest(arrayCopia) == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        /*resp propuesta: usa una variable aux. 
         int index1OldValue = table[index1];
        table[index1] = table[index2];
        table[index2] = index1OldValue;
        en terminos de recursos, el mio es mas eficiente.
        */
        array[index1] += array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] -= array[index2];
    }
    
    public static void sort(int[] array){
        /* resp propuesta:
         for (int i = 0; i < table.length-1; i++) {
             int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(table, i);
             swap(table, i, theIndexOfTheSmallest);
        */
        boolean swap = true;
        while (swap == true) {
            swap = false;
            for (int i = 0; i < array.length; i++) {
                if (i + 1 < array.length) {
                    if (array[i] > array[i + 1]) {
                        //swaps i   -> i+1
                        //      i+1 <- i
                        array[i] += array[i + 1];
                        array[i + 1] = array[i] - array[i + 1];
                        array[i] -= array[i + 1];
                        swap = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println( Arrays.toString(values) );
        sort(values);
        System.out.println( Arrays.toString(values) );
    }
}
