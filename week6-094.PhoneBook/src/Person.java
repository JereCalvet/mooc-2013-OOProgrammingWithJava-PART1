/**
 *
 * @author Jere
 */
public class Person {
    private String name;
    private String number;

    //getters
    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }
    //contructor
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
    
    @Override
    public String toString(){
        return this.name+" number: "+this.number;
    }
}
