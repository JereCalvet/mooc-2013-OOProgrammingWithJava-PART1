/**
 *
 * @author Jere
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        if (word.isEmpty() || searched.isEmpty()){
            return false;
        } 
        return word.toUpperCase().contains(searched.trim().toUpperCase());
        /*respuesta propuesta: lo hizo por partes utilzando los parametros en vez de hacer una sola linea
        
        word = word.trim();
        searched = searched.trim();
 
        word = word.toUpperCase();
        searched = searched.toUpperCase();
 
        return word.contains(searched);
        */
    }
}
