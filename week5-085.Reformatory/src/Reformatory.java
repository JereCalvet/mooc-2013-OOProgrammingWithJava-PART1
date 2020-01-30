public class Reformatory {
    private int weightMeasuredCounter;
            
    public Reformatory(){
        this.weightMeasuredCounter = 0;
    }
    
    public int weight(Person person) {
        this.weightMeasuredCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
        /*
        respuesta propuesta: nuevamente utiliza una variable para hacer el codigo mas legible, vale la pena?
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating + 1);
        */
    }
                
    public int totalWeightsMeasured() {
        return this.weightMeasuredCounter;
    }
}
