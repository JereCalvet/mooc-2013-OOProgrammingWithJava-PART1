/*
Tema: ArrayList como parametro de un metodo 
*/
import java.util.ArrayList;

public class NumberOfItems {

    public static int countItems(ArrayList<String> list){
        return list.size();    
    }
    public static void print(ArrayList<String> list) {
        for (String word : list) {
            System.out.println(word);
        }
    }
    public static void removeFist(ArrayList<String> list){
        list.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        System.out.println(countItems(list));
        print(list);
        removeFist(list);
        print(list);
    }

}
