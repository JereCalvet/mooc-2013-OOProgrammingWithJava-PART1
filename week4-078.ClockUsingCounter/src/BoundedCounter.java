/**
 *
 * @author Jere
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }
        this.value = value;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
        //respuesta propuesta:
        // this.value = 0; inicializa el valor en 0 en el constructor, en vez de hacerlo arriba en las variables
    }
    
    public void next(){
        if (this.value >= upperLimit){    //respuesta propuesta  //if (this.value == this.limit) {} 
            this.value = 0;               //tal como lo pense cuando lo escribia, solo con el = alcanza 
        } else {
            this.value++;
        }
    }
    
    @Override
    public String toString(){
        if (this.value < 10) {
            return "0"+this.value;
        }
        return ""+this.value;
        
        //respuesta propuesta: malisima, el mio es mejor
        /*    String initialZero = "0";
        if (this.value > 9) {
            initialZero = "";
        }
        return initialZero + this.value;*/
    }
}
