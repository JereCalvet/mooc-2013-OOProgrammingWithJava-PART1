
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
        /* respuesta propuesta: suma y despues hace un trato especial si los centavos se pasan de 100.
           El tratamiento que realiza no es necesario ya que el constructor de la clase lo hace automaticamente.
         int euroSum = euros + added.euros();
        int centSum = cents + added.cents();
 
        if (centSum > 99) {
            centSum -= 100;
            euroSum++;
      return new Money(euroSum, centSum);
        */
    }

    public boolean less(Money compared) {
        /*
        resp propuesta: definitivamente es mejor. Para mejorar mi codigo podria usar el moneyToCents y 1 if. lo voy a hacer
          return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
        */
        /*mi version vieja
        if (compared.euros > this.euros) {
            return true;
        }
        if (compared.euros == this.euros) {
            if (compared.cents > this.cents) {
                return true;
            }
        }
        return false;*/
        if (moneyToCents(this) < moneyToCents(compared)) {
            return true;
        }
        return false;
    }

    public double moneyToCents(Money value){
        double cents = 1.0 * value.cents / 100;
        cents += value.euros;
        cents *= 100;
        return cents;
    }
    
    public Money minus(Money decremented) {
        int result = (int) (moneyToCents(this) - moneyToCents(decremented));
        if (result < 0) {
            result = 0;
        }
        return new Money(0, result);
        /*
        resp propuesta: es mas "eficiente" en termino de recursos, prefioero la mia
    public Money minus(Money decremented) {
        int euroDifference = euros - decremented.euros();
        int centDifference = cents - decremented.cents();
 
        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }
 
        if (euroDifference < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDifference, centDifference);
        */
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
