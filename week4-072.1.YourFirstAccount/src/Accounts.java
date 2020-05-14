/*
Tema: clases  
*/
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account jereAcc = new Account("Jere's account",100.00);
        jereAcc.deposit(20.0);
        System.out.println(jereAcc);
    }

}
