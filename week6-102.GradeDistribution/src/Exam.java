
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Exam {

    private ArrayList<Grade> gradeList;

    public Exam() {
        this.gradeList = new ArrayList<Grade>();
    }

    public void addGrade(Grade grade) {
        this.gradeList.add(grade);
    }

    public void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public int catAmount(char cattegory){
        int counter = 0;
        for (Grade grade : gradeList) {
            if (grade.getCattegory() == cattegory){
                counter++;
            }
        }
        return counter;
    }
    
    public int allScores(){
        int sum = 0;
        for (Grade grade : gradeList) {
            sum ++;
        }
        return sum;
    }
    
    public int acceptedScores(){
        int sum = 0;
        for (Grade grade : gradeList) {
            if (grade.getCattegory() != '0') {
                sum ++;
            }
        }
        return sum;
    }
    
    public void printGrades() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(catAmount('5'));
        System.out.print("4: ");
        printStars(catAmount('4'));
        System.out.print("3: ");
        printStars(catAmount('3'));
        System.out.print("2: ");
        printStars(catAmount('2'));
        System.out.print("1: ");
        printStars(catAmount('1'));
        System.out.print("0: ");
        printStars(catAmount('0'));
        System.out.print("Acceptance percentage: ");
        System.out.println(String.format("%2.2f",(double)(100*acceptedScores())/allScores()));
    }
}
