/**
 *
 * @author Jere
 */
public class Counter {
    private int counter;
    private boolean check;

    //---construc
    public Counter(int startingValue, boolean check){
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0, false);
    }

    //---metodos
    public int value(){
        return this.counter;
    }
    
    public void increase(){
        increase(1);
    }
    
    public void decrease(){
        decrease(1);
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount < 0){
            return;
        }
        this.counter += increaseAmount;
        //respuesta propuesta: similar
        /*
         if (by >= 0) {
            this.value += by;
        */
    }
    
    public void decrease(int decreaseAmount){
        if (decreaseAmount < 0){
            return;
        }
        
        this.counter -= decreaseAmount;
 
        if (this.check == true) {
           if (this.counter < 0) {
               this.counter = 0;
           }
        }
        /*respuesta propuesta. igual
         if (this.check && this.value <0) {
            this.value = 0;
        */
    }
}


