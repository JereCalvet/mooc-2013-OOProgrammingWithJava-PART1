/*
Tema: ArrayList como parametro de un metodo 
*/

import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);
        /*Respuesta propuesta: es visiblemente mejor pero usar una variable mas
        int indexOfLast = list.size()-1;
        list.remove(indexOfLast);
        */
    }

    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        // sort the persons
        Collections.sort(persons);

        // and remove the last
        removeLast(persons);

        System.out.println(persons);
    }
}
