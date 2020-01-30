
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;      //respuesta propuesta, ver mas abajo
    
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = this.squareMeters*this.pricePerSquareMeter; //respuesta propuesta, ver mas abajo
    }

    /*  declaro el calculo como si fuera un metodo. yo lo pense pero defini un atributo mas
        private int price(){
        return pricePerSquareMeter*squareMeters;
    }
    */
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) { // respuesta propuesta: 1 sola linea de codigo, muy buena
            return true;                                        //return this.squareMeters>compared.squareMeters;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int dif = this.price - otherApartment.price;
        if (dif < 0){             //Respuesta propuesta: utilizo una funcion para evitar esa if feo
            dif *= -1;           //Math.abs(resta)
                    }
        return dif;
    }
    
      public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.price > otherApartment.price) {  //respuesta propuesta: 1 sola linea de codigo, muy buena
            return true;                          // return this.price()>compared.price();
        }
        return false;
    }
  
}
