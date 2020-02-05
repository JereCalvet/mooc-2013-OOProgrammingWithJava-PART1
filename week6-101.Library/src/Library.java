
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Library {
    private ArrayList<Book> list;
    
    public Library(){
        this.list = new ArrayList<Book>();    
    }
    
    public void addBook(Book newBook){
        this.list.add(newBook);
    }
    
    public void printBooks(){
        for (Book libro : list){
            System.out.println(libro); 
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book libro : list){
             if (StringUtils.included(libro.title(), title) ){
                 found.add(libro);
             }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book libro : list){
             if (StringUtils.included(libro.publisher(), publisher)){
                 found.add(libro);
             }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book libro : list){
             if (libro.year() == year){
                 found.add(libro);
             }
        }
        return found;
    }
    /*respuesta propuesta: utilizo un metodo de ayuda para buscar. 
    Pesimo mi codigo, que no me di cuenta de hacer un metodo helper. Copie y pegue el metodo 3 veces como un salame. MAL 
    El resto lo hice y funciona bien.
   
    forma correcta
         \/
                 
    public ArrayList<Book> searchByTitle(String title) {
        return searchBook(title, null, -1);
    }
 
    public ArrayList<Book> searchByPublisher(String publisher) {
        return searchBook(null, publisher, -1);
    }
 
    public ArrayList<Book> searchByYear(int year) {
        return searchBook(null, null, year);
    }
 
    // Helper method
    public ArrayList<Book> searchBook(String title, String bookName, int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)
                    || StringUtils.included(book.publisher(), bookName)
                    || book.year() == year) {
                found.add(book);
            }
        }
 
        return found;
    }
    */
}
