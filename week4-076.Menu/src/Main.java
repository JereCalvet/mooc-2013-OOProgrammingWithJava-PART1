import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         
        Menu exactum = new Menu();

        // When you have created addMeal(String meal) method,
        // you may remove the comments below
         exactum.addMeal("Fish fingers with sour cream sauce");
         exactum.addMeal("Vegetable casserole with salad cheese");
         exactum.addMeal("Chicken and nacho salad");

        // When you have created printMeals() method,
        // you may remove the comments below
         exactum.printMeals();

        // When you have created clearMenu() method,
        // You may remove the comments below
         exactum.clearMenu();
         exactum.printMeals();
         
        /* aca estuve boludeando con otro constructor
         ArrayList<String> menu1 = new ArrayList<String>();
         menu1.add("hambuguesa");
         menu1.add("pan de carne");
         menu1.add("arroz salteado");
         menu1.add("guiso de arroz");
         
         Menu jereDishes = new Menu(menu1);
         jereDishes.printMeals();
         */
    }
}
