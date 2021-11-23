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
/*
Buatkan program menghitung faktorial menggunakan
do-while
*/
import java.util.Random;

public class DoWHileFaktorial {
    public static void main (String args[]){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        int n = Math.round(21*x);
        long f = 1;
        int k = 1;
        
        do{
            f *=k++;
        }while (k <=n);
        System.out.println(n+ "! = " +f);
                
    }
}
