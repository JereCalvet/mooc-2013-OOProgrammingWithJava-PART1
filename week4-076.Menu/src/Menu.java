
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    /*public Menu(ArrayList<String> inicialMenu){        //este constructor lo hice para probar
        this.meals = inicialMenu;
    }*/
    
    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal : this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
