
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Phonebook {

    private ArrayList<Person> agenda;

    //constructor
    public Phonebook() {
        this.agenda = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.agenda.add(new Person(name, number));
    }

    public void printAll() {
        for (Person contacto : this.agenda) {
            System.out.println(contacto);
        }
    }

    public String searchNumber(String name) {
        for (Person contacto : this.agenda) {
            if (contacto.getName().equals(name)){
                return contacto.getNumber();
            }
        }
        return "number not known";
    }    
}
