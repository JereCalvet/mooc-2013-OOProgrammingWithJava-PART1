
public class Main {

    public static void main(String[] args) {
        MyDate first = new MyDate(8, 1, 2013);
        MyDate second = new MyDate(4, 8, 2010);
      
        System.out.println(first + " and " + second + " difference in years: (2) " + second.differenceInYears(first));
        System.out.println(first + " and " + second + " difference in years: (2) " + first.differenceInYears(second));
                
    }
}
