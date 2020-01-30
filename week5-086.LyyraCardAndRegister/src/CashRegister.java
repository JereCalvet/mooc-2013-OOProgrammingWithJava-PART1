
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    /* resp. propuesta: cierto que este usa constantes que nunca enseñaron 
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_IOF_GOURMET = 4.0;
    */

    public CashRegister() {
        this.cashInRegister = 1000.0;
        this.economicalSold = this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {//resp. propuesta: usa las constantes que nunca mecionarion en el manual
        if (cashGiven >= 2.50) {
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {//resp. propuesta: usa las constantes que nunca mecionarion en el manual
        if (cashGiven >= 4.00) {
            this.cashInRegister += 4.00;
            this.gourmetSold++;
            return cashGiven - 4.00;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {//resp. propuesta: usa las constantes que nunca mecionarion en el manual
        if (card.pay(2.50)) {                     //        if (card.balance() < PRICE_IOF_GOURMET) {
            this.economicalSold++;                //           return false;}
            return true;                          // usa card balance, al dope, ya que el metodo pay devuelve falso, si no alcanza
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {//resp. propuesta: usa las constantes que nunca mecionarion en el manual
        if (card.pay(4.00)) {                  //igual que en el anterior, usa balance() y no es necesario
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double amount){
        if (amount > 0) {
            card.loadMoney(amount);
            this.cashInRegister += amount;
        }
    }
    
    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
