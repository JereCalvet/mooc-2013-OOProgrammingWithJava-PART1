/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jere
 */
public class LyyraCard {

    private double balance;
    /*
     private final double ECONOMICAL = 2.5;   chiter declaro constantes
    private final double GOURMET = 4.0;
    */
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {    //aca resto con constantes
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {    //aca resto con constantes
            this.balance -= 4.0;
        }
    }

    public void loadMoney(double amount) {
        /* Respuesta propuesta: no calcula la dif. el mio es mejor 
         if (amount < 0) {
            return;
        }
 
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        */
        
        if (amount > 0) {
            if ((this.balance + amount) > 150.0) {
                double aux = 150.0 - this.balance;
                this.balance += aux;
            } else {
                this.balance += amount;
            }
        }
    }
}
