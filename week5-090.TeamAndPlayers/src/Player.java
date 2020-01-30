/**
 *
 * @author Jere
 */
public class Player {
    private String name;
    private int amountOfGoals;

    //getters
    public String getName() {
        return this.name;
    }

    public int goals() { //getter
        return this.amountOfGoals;
    }
    
    //contructor
    public Player(String pName, int pAmountofGoals){
        this.name = pName;
        this.amountOfGoals = pAmountofGoals;        
    }
    
    public Player(String pName){  //respuesta propuesta: no repetir codigo
        this.name = pName;        //    this(name, 0);
        this.amountOfGoals = 0;   // utilizar el constructor anterior!! dios me olvide ptm
    }

    @Override
    public String toString() {
        return this.name+", goals "+this.amountOfGoals; 
    }
    
    
}
