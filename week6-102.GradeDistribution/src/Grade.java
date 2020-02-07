/**
 *
 * @author Jere
 */
public class Grade {
    private int score;
    private char cattegory;

    public char getCattegory() {
        return cattegory;
    }

    public int getScore() {
        return score;
    }
    
    public Grade(int score){
        this.score = score;
        this.calculateCat();
    }
    
    public void calculateCat(){
        if (this.score <= 29) {
            this.cattegory = '0';
        } else if (this.score<=34) {
            this.cattegory = '1';
        } else if (this.score<=39) {
            this.cattegory = '2';
        } else if (this.score<=44) {
            this.cattegory = '3';
        } else if (this.score<=49) {
            this.cattegory = '4';
        } else {
            this.cattegory = '5';
        }  
    }
    
    @Override
    public String toString(){
        return "Cat: "+this.cattegory+" Grade: "+this.score;
    }
}
