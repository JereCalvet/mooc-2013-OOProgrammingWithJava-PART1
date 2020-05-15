/*
Tema: ArrayList de objetos dentro de objetos
*/
public class Main {

    public static void main(String[] args) {
        /*
        Team river = new Team("Club Atletico River Plate");
        System.out.println("Team: " + river.getName());
        river.setMaxSize(20);
        
        Player ponzio = new Player("Leonardo Ponzio");
        Player skoken = new Player("Ignacio Sccoco", 21);
        
        river.addPlayer(ponzio);
        river.addPlayer(skoken);
        river.addPlayer(new Player("Enzo Perez", 2));
        river.printPlayers();
        
        System.out.println("Goles del equipo: " + river.goals());
        */
        
        Team j = new Team("RAGE");
        Player p = new Player("Jaakko");
        j.addPlayer(p); 
        j.printPlayers();
     
    }
}
