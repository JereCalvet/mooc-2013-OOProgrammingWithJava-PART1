/*
Tema: *ejercicio libre
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam gradeList = new Exam();
        
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int score = intInput(sc);
            if (score == -1) {
                break;
            }
           if (score > -1 && score < 61){
               gradeList.addGrade(new Grade(score)); 
           } 
        }
        System.out.println();
        gradeList.printGrades();
    }
                                                        /*
    public static String stringInput(Scanner ok) {      no lo use 
        return ok.nextLine();
    }                                                       
                                                       */
    public static int intInput(Scanner ok) {
        return Integer.parseInt(ok.nextLine());
    }
}
