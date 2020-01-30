
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Team {

    private String name;
    private ArrayList<Player> jugadores;
    private int size;
     
    //getters
    public int size() {
        return this.jugadores.size();
    }

    public String getName() {
        return this.name;
    }

    //constructor
    public Team(String name) {
        this.name = name;
        this.jugadores = new ArrayList<Player>();
        this.size = 16;
    }

    public void addPlayer(Player jugador) {
        if (this.jugadores.size() >= this.size) {
            return;
        }
        this.jugadores.add(jugador); 
    }

    public void setMaxSize(int size) {
        this.size = size;
    }
    
    public int goals(){
        int sum = 0;
        for (Player jugador : this.jugadores) {
            sum += jugador.goals();
        }
        return sum;
    }
    
    public void printPlayers() {
        for (Player jugador : this.jugadores) {     //resp propuesta: cierto el string se llama solo, no era necesario
            System.out.println(jugador.toString()); //System.out.println(player);
        }
    }

}
