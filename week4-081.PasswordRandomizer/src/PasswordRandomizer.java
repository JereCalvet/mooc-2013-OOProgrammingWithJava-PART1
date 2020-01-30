
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordRandomizer {

    private int length = 0;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        ArrayList<String> letters = new ArrayList<String>();
        Collections.addAll(letters, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z");
        String createdPassword = "";
        
        int i = 0;
        while (i < this.length) {
             int numOfLetter = this.random.nextInt(26);  //genera un #random entre 0 y 25 
             createdPassword += letters.get(numOfLetter); //busca en el indice 0,25 -> 26 letras
             i++;
        }
        return createdPassword;
        /*
        Respuesta propuesta: similares
        String characters = "abcdefghijklmnopqrstuvwxyz";
 
        String password = "";
        int numberOfCharacters = this.length;
        int luku = 0;
        while (numberOfCharacters > 0) {
            luku = this.random.nextInt(characters.length());
            char c = characters.charAt(luku);
            password = password + c;
            numberOfCharacters--;
        }
        
        return password+" "+luku;*/
    }
}
