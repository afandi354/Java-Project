package While;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program yang menggunakan loop while
untuk menguji keprimaan suatu angka
*/
import java.util.Random;

public class WhilePrima {
    public static void main(String args[]){
        Random acak = new Random();
        float x = acak.nextFloat();
        
        System.out.println("x = "+x);
        int n = (int)Math.floor(101*x);
        boolean apaPrima = (n > 1);
        int d = 2;
        
        while (apaPrima && d<n)
            apaPrima = (n % d++ !=0);
        
        if(apaPrima) System.out.println(n+ " adalah prima.");
        else System.out.println(n+ "bukan prima.");
    }
}
