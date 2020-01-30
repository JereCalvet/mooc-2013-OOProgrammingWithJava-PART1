import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int endPart = Integer.parseInt(reader.nextLine());
        // example 4 
        // java 3
        //copia desde (primer parametro) hasta (segundo parametro)
        //primer parametro desde = lenght de la palabra - input del usuario
        //desde la parte que necesito 
        //hasta (segundo parametro) el final
        System.out.println("Result: "+word.substring((word.length()-endPart),word.length()));
        
        /*Resultado: este codigo es mas legible pero utiliza una variable mas startingposition 
         int startingPosition = word.length() - lengthOfEnd;
        System.out.print("Result: " + word.substring(startingPosition, word.length()));
        */
    }
}
