/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoWhile;

/**
 *
 * @author fun_dy
 */
import java.util.Random;

public class DoWhilePrima {

    public static void main(String args[]) {
        Random acak = new Random();

        float x = acak.nextFloat();
        System.out.println("x = " + x);
        int n = Math.round(97 * x + 2);
        boolean apaPrima;
        int d = 2;
        do {
            apaPrima = (n % d++ != 0);
        } while (apaPrima && d < n);

        if (apaPrima) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}
