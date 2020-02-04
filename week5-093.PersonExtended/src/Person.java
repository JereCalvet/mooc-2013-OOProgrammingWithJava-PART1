
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    //constructores
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
         //respuesta propuesta: utiliza mas variables para hacer el metodo mas legible. es correcto? 
        /*
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DATE);
        this.birthday = new MyDate(day, month, year);
        */
    }

    //-----------------
    //Metodos
    public int age() {
        MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
        return today.differenceInYears(birthday);
        //respuesta propuesta: utiliza mas variables para hacer el metodo mas legible. es correcto? 
        /*
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DATE);
        MyDate tamaPaiva = new MyDate(day, month, year);
        return birthday.differneceInYears(tamaPaiva);
        */
    }

    public boolean olderThan(Person compared) {
        if (this.age() > compared.age()) {
            return true;                                       //version anterior tenia otro if, si tienen la misma edad
        } else if (this.birthday.earlier(compared.birthday)) { // if (this.age() == compared.age())
            return true;
        }
        return false;
    }

    //-------------------
    //getter
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
