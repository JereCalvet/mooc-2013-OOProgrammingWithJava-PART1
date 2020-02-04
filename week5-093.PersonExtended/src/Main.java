
public class Main {

    public static void main(String[] args) {
        /*Person jere = new Person("Jeremias", 7, 6, 1990);
        Person camila = new Person("Camila", 22,7,2002);
        System.out.println(jere.age());
        System.out.println(camila.age());
        System.out.println("Jere es mas grande? "+jere.olderThan(camila));
        System.out.println("Camila es mas grande? "+camila.olderThan(jere));
        System.out.println("");
        
        Person agustin = new Person("Agustin", new MyDate(26,12,2003));
        System.out.println(agustin.age());
        
        Person hoy = new Person("hoy");
        System.out.println(hoy.age());
        */
        Person helga = new Person("Helga", 31,12,2009);
        Person janika = new Person("Janika", 1,1,2010);
        
        System.out.println(helga.age());
        System.out.println(janika.age());
        System.out.println(helga.olderThan(janika));
       
        //Person Helga, born 31.12.2009 should be older than Janika, born 1.1.2010
    }
}
