/*
Tema: Objetos en una lista
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name, number, searchTerm;            //repsuesta propuesta: soy un boludo, lo puedo declarar en linea y no hace falta inicializarlas, me olvide
        //name = number = searchTerm = "";            

        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            //input -----
            System.out.print("Name: ");
            String name = sc.nextLine();             //correción: aca se declara y usa

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Student Number: ");
            String number = sc.nextLine();         //correción: aca se declara y usa
            //---------
            Student studentObj = new Student(name, number);
                                       // resp. propuesta: aca importante 
            list.add(studentObj);      //list.add(new Student(name, number)); 
                                       //directamente llama al constructor
            System.out.println("");
        }
        //print------
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("");    //respuesta propuesta: System.out.println(); resulta que se puede usar sin parametros. buen datos
        //-----
        System.out.print("Give a search term: ");
        String searchTerm = sc.nextLine();         //correción: aca se declara y usa
        System.out.println("Result: ");
        
        for (Student student : list) {
            if (student.getName().indexOf(searchTerm) != -1) {
            //if (student.getName().contains(searchTerm)) { //cualquiera de los 2 if funciona, lo hice sin leer el tip
                System.out.println(student);
            }
        }
    }
}    
